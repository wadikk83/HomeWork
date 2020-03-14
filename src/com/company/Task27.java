package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task27 {
    /*Создать коллекцию, наполнив ее случайными числами
     *Удалить повторяющиеся числа
     */
    public static int element = 10; //number of list items

    public static void main(String[] args) {

        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            randomList.add((int) (Math.random() * 10));
        }

        System.out.println(randomList);
        List<Integer> randomListWithoutRep = randomList.stream().distinct().collect(Collectors.toList());
        System.out.println(randomListWithoutRep);
    }
}

