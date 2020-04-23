package com.company.Lesson5;

public class Task20 {
    public static void main(String[] args) {
        String lineWithText = new String("Это тестовая строка   с  пробелами   ");
        String newLine = "";
        int temp;
        String[] arrayOfWords = lineWithText.split(" ");
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() > 0) {
                newLine = newLine + arrayOfWords[i].charAt(arrayOfWords[i].length() - 1);
            }
        }
        System.out.println("New text is " + newLine);
    }
}
