package com.prachi;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author prachi
 */
public class CountAndSortLetterInString {

    public String countAndSortLetter(String input) {
        input=input.toLowerCase();

        StringBuffer outputString = new StringBuffer();
        char elementAlreadyCounted = ' ';

        char[] inPutArray=input.toCharArray();

        int counter;
        Arrays.sort(inPutArray);

        input= new String(inPutArray); // storing sorted array
        inPutArray= input.toCharArray();


        for (int i = 0; i < inPutArray.length; i++) {
            counter = 1;
            if (inPutArray[i] != elementAlreadyCounted) {


                for (int j = i+1; j <input.length(); j++) {
                    if (input.charAt(j) == inPutArray[i]) {
                        counter++;
                    }
                }
                elementAlreadyCounted = inPutArray[i];
                outputString.append(inPutArray[i]);
                outputString.append(counter);
            }
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        CountAndSortLetterInString countAndSortLetterInString = new CountAndSortLetterInString();
        String outPut = countAndSortLetterInString.countAndSortLetter("Prachi_Singh");
        System.out.println(outPut);
    }
}
