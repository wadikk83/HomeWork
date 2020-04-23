package by.home.chapter1.hometask27;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
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
