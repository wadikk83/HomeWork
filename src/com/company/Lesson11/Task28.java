package com.company.Lesson11;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task28 {
    /*Создать список оценок учеников с помощью ArrayList.
     *Заполнить случайными оценками.
     * Найти самую высокую оценку с использованием итератора
     */
    private static int element = 10; //number of list items
    private static int maxValue = 0;

    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();

        /*List<Integer> randomList1 = new Random()
                .ints()
                .limit(10)
                .collect(Collectors.toList());*/

        for (int i = 0; i < element; i++) {
            randomList.add((int) (Math.random() * 10));
        }
        System.out.println(randomList);

        Iterator<Integer> iterator = randomList.iterator();
        while (iterator.hasNext()) {
            int iteratorValue = iterator.next();
            if (iteratorValue > maxValue) {
                maxValue = iteratorValue;
            }

        }

        System.out.println(maxValue);
    }
}
