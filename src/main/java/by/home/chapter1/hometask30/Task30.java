package by.home.chapter1.hometask30;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task30 {
    /*Создать файл с текстом, прочитать
      Подсчитать в тексте количество знаков препинания и слов
     */
    static String path = "./Lesson13/task30.txt";
    //static String path = null;

    public static void main(String[] args)  {
        // CreateFileWithText(path); //расскоментить для создания файла с текстом

        List<String> list = null;

        try {  //читаем файл и пихаем в лист
            list = ReadTextFromFile(path);
        } catch (InvalidPathException e) {
            System.out.println("Path not found or does not exist");
        } catch (NullPointerException e) {
            System.out.println("Дурень, не кидай null вместо имени файла");
        }

        int lengthBeforeDeleteToken = list.stream() //сумма до удаления знаков препинания
                .mapToInt(s -> s.length())
                .sum();

        List<String> listAfterDeleteToken = list.stream() //убираем знаки препинания
                .map(entry -> entry.replaceAll("[.,;:?!-]", ""))
                .collect(Collectors.toList());

        int lengthAfterDeleteToken = listAfterDeleteToken.stream() //сумма после удаления знаков препинания
                .mapToInt(s -> s.length())
                .sum();
        System.out.println("Punctuation marks - " + (lengthBeforeDeleteToken - lengthAfterDeleteToken));

        long countWords = listAfterDeleteToken.stream()
                .filter(item -> item != null && !"".equals(item))
                .count();
        System.out.println("Word count - " + countWords);


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

    public static boolean IfFileExist(File file) { //Если файл уже существует, решаем что делать - перезаписать или добавить
        if (file.exists()) {
            System.out.println("File is alredy exist. Overwrite? (y/n)");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String fileOverWrite = scanner.nextLine();
                if (fileOverWrite.equals("y")) {
                    return false;
                }

                if (fileOverWrite.equals("n")) {
                    return true;
                }
                System.out.println("Incorrect");
            }
        } else return false;
    }

    public static void CreateFileWithText(String path) { //Создаем файл и наполняем его текстом
        File file = null;
        boolean fileExist = false; //признак что такой файл существует

        // Если передали путь - то создаем файл по указанному пути, иначе создаем временный файл
        if (path != null) {
            file = new File(path);
            fileExist = IfFileExist(file);
        } else
            try {
                file = File.createTempFile("javalessons", null, null);
                path = file.getCanonicalPath();
            } catch (IOException e) {
                System.out.println("Temp file can't be created");
            }

        try {//открывает текст и пишем в него текст с консоли
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, fileExist));
            System.out.println("Create new file on path " + file.getCanonicalPath());
            System.out.println("Please, enter text. To exit please type \" end \" ");
            Scanner scanner = new Scanner(System.in);
            while (true) { //хреновый цикл - потом переделать
                String tempString = scanner.nextLine();
                if (tempString.equals("end")) {
                    writer.flush();
                    writer.close();
                    break;
                }
                writer.write(tempString + "\n");
            }
        } catch (IOException e) {
            System.out.println("Crash");
        }
    }

}
