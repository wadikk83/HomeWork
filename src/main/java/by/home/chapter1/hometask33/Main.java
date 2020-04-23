package by.home.chapter1.hometask33;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final String directory = "./";

        FileSystemService fs = new FileSystemService();

        try {
            fs.showFiles(directory);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файлов");
        }

        System.out.println("======================================================================================");

        try {
            fs.showSubDirectory(directory);
        } catch (IOException e) {
            System.out.println("Ошибка чтения каталогов");
        }
    }
}
