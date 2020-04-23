package by.home.chapter1.hometask28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

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
