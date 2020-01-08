package com.prachi;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author prachi
 */
public class FindingUpperCaseLetters {

    private HashMap<Character, Integer> map = new HashMap();


    public String findUpperCaseLetters(String input) {

        StringBuffer outPutString = new StringBuffer();

        if (input != null) {

            char[] charArray = input.toCharArray();

            for (char a : charArray) {
                if (Character.isUpperCase(a)) {

                    if (map.get(a) != null) {
                        map.put(a, map.get(a) + 1);
                    } else {
                        map.put(a, 1);
                    }
                }
            }

        }

        //iterating map to get the results

        Iterator<Character> mapIterator = map.keySet().iterator();

        while (mapIterator.hasNext()) {
            Character key=mapIterator.next();
            outPutString.append("Uppercase character ");
            outPutString.append(key);
            outPutString.append(" has occurred ");
            outPutString.append(map.get(key));
            outPutString.append(" number of times ");
            outPutString.append("\n");
        }
        return outPutString.toString();

    }

    public static void main(String[] args) {
        FindingUpperCaseLetters findingUpperCaseLetters = new FindingUpperCaseLetters();
        String output = findingUpperCaseLetters.findUpperCaseLetters("Prachi Singh For SharedServer fixSSSSSSSSSSSSSSS");
        System.out.println(output);
    }
}
