package com.prachi;

/**
 * @author prachi
 */
public class Palindrome {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(156));

    }

    private boolean isPalindrome(int x) {

        int temp=x;
        int remaninder;
        int reversedNum=0;

        if(x < 0){
            return false;
        }
        while(temp!=0){
            remaninder=temp%10;
            reversedNum=reversedNum*10 + remaninder;
            temp = temp/10;
        }
     return reversedNum == x;
    }

}
