package by.home.chapter1.hometask31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //task31
    static String path = "./src/main/java/by/home/chapter1/hometask31/file31.txt";

    //static String path = null;
    public static void main(String[] args) {
        List<String> list = null;

        try {  //читаем файл и пихаем в лист
            list = ReadTextFromFile(path);
        } catch (InvalidPathException e) {
            System.out.println("Path not found or does not exist");
        } catch (NullPointerException e) {
            System.out.println("Дурень, не кидай null вместо имени файла");
        }

        List<Integer> listAfterDeleteToken = list.stream() //оставляем только числа
                .map(entry -> entry.replaceAll("[^0-9]+", ""))
                .map(Integer::parseInt) //превращаем в Integer
                .collect(Collectors.toList());

        System.out.println(listAfterDeleteToken);//выводим на экран

        int sumOfNumbers = listAfterDeleteToken.stream() //считаем сумму
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers -> " + sumOfNumbers);

        List<Integer> listArterDeleteDublicate = listAfterDeleteToken.stream() //удаляем дубликаты
                .distinct()
                .collect(Collectors.toList());
        System.out.println(listArterDeleteDublicate);
    }

    public static List<String> ReadTextFromFile(String url) throws InvalidPathException, NullPointerException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get(url); //Если путь корявый кинем exception наверх
        try (Stream<String> lineStream = Files.lines(path)) {
            lines = lineStream
                    .map(e -> e.split(" "))
                    .flatMap(lineArr -> Arrays.stream(lineArr))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Stream not created");
        }
        return lines;
    }
}
