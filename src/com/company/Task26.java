package com.company;

import javax.imageio.stream.FileImageInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task26 {

    /* Создать список оценок учеников с помощью ArrayList,
     * заполнив случайными оценками. Удалить
     * неудовлетворительные оценки из списка
     */

    public static int element = 10; //number of list items
    public static int negative = 4; //negative rating

    public static void main(String[] args) {
        List<Integer> ratingList = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            ratingList.add((int) (Math.random() * 10));
        }

        System.out.println(ratingList);

        List<Integer> ratingGood = ratingList.stream()
                .filter(integer -> integer > negative)
                .collect(Collectors.toList());

        System.out.println(ratingGood);

    }


}
