package com.prachi;

/**
 * @author prachi
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello Pra"));

    }

    private static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int length;

        if(arr.length == 0){
            length = 0;
        }
        else{
            String lastWord = arr[arr.length-1];
            length = lastWord.toCharArray().length;
        }

        return length;
    }
}
