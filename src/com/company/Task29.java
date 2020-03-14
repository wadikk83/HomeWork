package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task29 {
    /*Имеется текст. Следует составить для него частотный словать
     */
    static String text = "как часто, Как часто Будут здесь будут слова";

    public static void main(String[] args) {
        text = text.toLowerCase(); //Будем считать что все слова с маленькой буквы
        System.out.println(text);

        Map<String, Integer> vocabulary = new HashMap<>();
        String token = "";

        StringTokenizer tokenizer = new StringTokenizer(text, " ,.:;!?"); //разделяем на слова
        while (tokenizer.hasMoreTokens()) {
            // Выводим лексемы в HashMap
            token = tokenizer.nextToken();
            System.out.println(token);
            if (!vocabulary.containsKey(token)) {
                vocabulary.put(token, 1);
            } else vocabulary.put(token, vocabulary.get(token) + 1);
        }
        System.out.println(vocabulary);
    }

}
