package com.company;

public class ConvertRegister {
    public static String toUpperCase(String inputString) {
        char[] stringToUpperCase = inputString.toCharArray();
        for (int i = 0; i < stringToUpperCase.length; i++)
            if (((stringToUpperCase[i] >= 'a') && (stringToUpperCase[i] <= 'z')) ||
                    ((stringToUpperCase[i] >= 'а') && (stringToUpperCase[i] <= 'я'))) {
                stringToUpperCase[i] = (char) (stringToUpperCase[i] - 32);
            }
        return String.valueOf(stringToUpperCase);
    }

    public static String toLowerCase(String inputString) {
        char[] stringToLowerCase = inputString.toCharArray();
        for (int i = 0; i < stringToLowerCase.length; i++)
            if (((stringToLowerCase[i] >= 'A') && (stringToLowerCase[i] <= 'Z')) ||
                    ((stringToLowerCase[i] >= 'А') && (stringToLowerCase[i] <= 'Я'))) {
                stringToLowerCase[i] = (char) (stringToLowerCase[i] + 32);
            }
        return String.valueOf(stringToLowerCase);
    }
}
