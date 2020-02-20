import java.util.Arrays;

/**
 * @author prachi
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        int rotatePoint = nums.length - k;
        int j = 0;

        for (int i = rotatePoint; i < nums.length; i++) {
            temp[j++] = nums[i];
        }
        for (int i = 0; i < rotatePoint; i++) {
            temp[j++] = nums[i];
        }

        nums = temp;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1,2,3,4,5,6,7},3);
    }
}
