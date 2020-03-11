package com.company;

public class Task19 {
    public static void main(String[] args) {
        String lineWithText = new String("Это тестовая строка   с  пробелами   ");
        String[] arrayOfWords = lineWithText.split(" ");
        int countWords = 0;
        for (String arrayOfWord : arrayOfWords) {
            if (arrayOfWord.length() > 0) {
                countWords++;
            }
        }
        System.out.println("The number of words in the text " + countWords);
    }

}
