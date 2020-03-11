package com.company;

public class Task18 {
    public static void main(String[] args) {
        char[] punctuationMarks = {'.', ',', '-', ':', ';', '?', '!'};
        String inputLine = "Привет! Это строка, в которой- надо посчитать! знаки ; препинания";
        int countPunctuationMarks = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            for (int j = 0; j < punctuationMarks.length; j++) {
                if (inputLine.charAt(i) == punctuationMarks[j]) {
                    countPunctuationMarks++;
                }
            }
        }
        System.out.println("Punctuation marks " + countPunctuationMarks + " pieces");
    }
}
