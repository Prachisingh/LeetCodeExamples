package com.prachi;

/**
 * @author prachi
 */
public class ConvertNameConvFromCToJava {
    public String converNamingConv(String inputString) {
        StringBuffer outPutStringBuffer = new StringBuffer();
        String outPutString = "";

        if (inputString.contains("_")) {
            String[] splitArray = inputString.split("_");
            for (int i = 1; i < splitArray.length; i++) {

                String s = splitArray[i];
                char[] subStringArray = s.toCharArray();
                subStringArray[0] = Character.toUpperCase(subStringArray[0]);
                String finalSubString = new String(subStringArray);
                splitArray[i] = finalSubString;

            }
            for (String s : splitArray) {
                outPutStringBuffer.append(s);
            }
            outPutString = outPutStringBuffer.toString();
        }
        return outPutString;

    }

    public static void main(String[] args) {
        ConvertNameConvFromCToJava convertNamingConventions = new ConvertNameConvFromCToJava();
        System.out.println(convertNamingConventions.converNamingConv("initial_Name_Of_person"));
        System.out.println(convertNamingConventions.converNamingConv("initial_Name"));

    }
}
