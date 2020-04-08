package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task32 {

    /*Записать в двоичный файл 20 случайных чисел
      Прочитать записанный файл.
      Распечатать числа и их среднее арифметическое
     */
    static String path = "./task32.txt";
    //static String path = null;

    public static void main(String[] args) {
        path = CreateBinaryFileWithRandomNumber(path); //расскоментить для создания файла с 20 случайными числами
        List<Integer> list = null;

        try {  //читаем бинарный файл и пихаем в лист
            list = ReadTextFromBinaryFile(path);
        } catch (FileNotFoundException e) {
            System.out.println("Path not found or does not exist");
            return;
        } catch (NullPointerException e) {
            System.out.println("Дурень, не кидай null вместо имени файла");
            return;
        }

        System.out.println(list);

        //среднее арифметическое
        System.out.println("Среднее арифметическое -> " +list.stream().mapToInt(Integer::intValue).average());

    }

    public static List<Integer> ReadTextFromBinaryFile(String url) throws FileNotFoundException, NullPointerException {
        List<Integer> lines = new ArrayList<>();

        DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream(url)));
        //Exception кидаем наверх
        while (true) {
            try {
                lines.add(reader.readInt());
            } catch (IOException e) {
                break;
            }
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

    public static String CreateBinaryFileWithRandomNumber(String path) { //Создаем файл и наполняем его текстом
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

        try {//открывает текст и пишем в него 20 случайных чисел
            DataOutputStream writer = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));

            System.out.println("Create new file on path " + file.getCanonicalPath());
            for (int i = 1; i < 21; i++) {
                //writer.writeInt((int) (Math.random()*100));
                int temp = (int) (Math.random() * 100);
                System.out.println(temp);
                writer.writeInt(temp);
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Crash");
        }
        return path;
    }
}
