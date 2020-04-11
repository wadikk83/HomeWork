package by.home.chapter1.hometaskbylesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final String url = "./books/BookList.obj";

        List<Book> books = new ArrayList<>();
        books.add(new Book("Author1", "Title1"));
        books.add(new Book("Author2", "Title2"));
        books.add(new Book("Author3", "Title3"));
        books.add(new Book("Author2", "Title4"));
        books.add(new Book("Author1", "Title5"));
        books.add(new Book("Author1", "Title6"));

        FileService fileService = new FileService();
        fileService.createFile(url, books);

        List<Book> books1 = fileService.readFile(url).stream().sorted(Comparator.comparing(Book::getAuthor)).collect(Collectors.toList());

        for (Book b : books1) {
            System.out.println(b.toString());
        }

        fileService.deleteFile(url);
    }
}
