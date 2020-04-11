package by.home.chapter1.hometaskbylesson15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService implements FileOperation {
    @Override
    public void createFile(String url, List<Book> books) {
        File file = new File(url);
        file.mkdir();
        try {
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(url));
            for (Book b : books) {
                writer.writeObject(b);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e.toString());
        }
    }

    @Override
    public List<Book> readFile(String url) {
        List<Book> books = new ArrayList<>();
        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream(url));
            while (true) {
                try {
                    books.add((Book) reader.readObject());
                } catch (Exception e) {
                    break;
                }

            }
        } catch (IOException e) {
            System.out.println("Что-то пошло не так: " + e.toString());
        }
        return books;
    }

    @Override
    public boolean updateFile(String url, List<Book> books) {
        //этот метод мы не будем реализовывать
        return false;
    }

    @Override
    public void deleteFile(String url) {
        //И этот пока не будем реализовывать
    }
}
