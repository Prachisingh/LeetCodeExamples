/**
 * @author prachi
 */
public class MaxProfitAlgorithm {
    int maxProfitSum ;
    int difference;
    int maxDifference;

    public int maxProfit(int[] prices) {

        boolean sortedInAscOrder = true;
        boolean sortedInDescOrder = true;

        // check if given array is in ascendig order thn simply return a[last]- a[first]
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] > prices[i + 1]) {
                sortedInAscOrder = false;
                break;
            }

        }

        // check if given array is in descebding order thn simply return 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i + 1]) {
                sortedInDescOrder = false;
                break;
            }

        }
        if (sortedInAscOrder) {
            return prices[prices.length - 1] - prices[0];
        } else if (sortedInDescOrder) {
            return 0;
        } else {
            return getMaxProfit(prices);
        }
    }

    private int getMaxProfit(int[] prices){

        for(int i = 0; i < prices.length ; i++){

            for(int j = i+1 ; j < prices.length ; j++){

                if(prices[i] - prices[j] < 0){

                    difference = prices[j] - prices[i];

                    if(difference > maxDifference){

                        maxDifference = difference;
                        maxProfitSum = maxProfitSum + maxDifference;
                    }
                }
            }
        }

        return maxProfitSum;
    }

    public static void main(String[] args) {
        MaxProfitAlgorithm maxProfitAlgorithm = new MaxProfitAlgorithm();

//        System.out.println(maxProfitAlgorithm.maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfitAlgorithm.maxProfit(new int[]{7,1,5,3,6,4}));

    }
}
