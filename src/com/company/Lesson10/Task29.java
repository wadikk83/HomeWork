package com.company.Lesson10;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.counting;


public class Task29 {
    /*Имеется текст. Следует составить для него частотный словать
     */
    static String text = "как часто, Как часто      Будут здесь будут слова репка ";

    public static void main(String[] args) {
        text = text.toLowerCase(); //Будем считать что все слова с маленькой буквы

        Map<String, Integer> vocabulary = new HashMap<>();
        String token = "";

        StringTokenizer tokenizer = new StringTokenizer(text, " [,;:.!?\\s]+");
        /*разделяем на слова, используя символы ,.:;!?
         *в качестве разделителя
         */

        while (tokenizer.hasMoreTokens()) {
            // Выводим лексемы в HashMap
            token = tokenizer.nextToken();
            System.out.println(token);
            if (!vocabulary.containsKey(token)) {
                vocabulary.put(token, 1);
            } else vocabulary.put(token, vocabulary.get(token) + 1);
        }
        System.out.println(vocabulary);

        //2 метод
        Map<String, Integer> vocabulary1 = new HashMap<>();
        tokenizer = new StringTokenizer(text, " [,;:.!?\\s]+");
        while (tokenizer.hasMoreTokens()) {
            // Выводим лексемы в HashMap
            vocabulary1.merge(tokenizer.nextToken(), 1, (oldval, newval) -> (oldval + newval));
        }
        System.out.println(vocabulary1);


        //3 метод
        text = text.replaceAll("[^а-яА-Я a-zA-Z]", "");
        //text = text.toLowerCase();
        System.out.println(text);
        List<String> textList = Arrays.asList(text.split("[\\p{Punct}\\s]+"));
        //\w+" - модификатор находит только слова, то есть исключает знаки и т.п.
        Map<String, Long> vocabulary2 = textList.stream()
                .collect(Collectors.groupingBy(s -> s, counting()));
        System.out.println(vocabulary2);


        for (Map.Entry<String, Long> e : vocabulary2.entrySet()) System.out.println(e.getKey() + "->" + e.getValue());


    }


}
