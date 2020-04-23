package by.home.chapter1.hometaskbylesson15;

import java.util.List;

public interface FileOperation {
    public void createFile(String url, List<Book> books);

    public List<Book> readFile(String url);

    public boolean updateFile(String url, List<Book> books);

    public void deleteFile(String url);
}
