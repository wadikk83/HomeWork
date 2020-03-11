package com.company;

public class Task18 {
    public static void main(String[] args) {
        String inputLine = "Привет! Это строка, в ко<>торой- надо посчитать! знаки ; препинания#$%";
        int countPunctuationMarks = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            if ((!Character.isLetterOrDigit(inputLine.charAt(i))) && (!Character.isSpaceChar(inputLine.charAt(i)))) {
                countPunctuationMarks++;
            }
        }
        System.out.println("Punctuation marks " + countPunctuationMarks + " pieces");

    }
}
