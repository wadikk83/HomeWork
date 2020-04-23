package by.home.chapter1.hometask33;

import java.io.IOException;

public interface FileSystemServiceInterface {
    void showFiles(String directory) throws IOException;

    void showSubDirectory(String directory) throws IOException;

}
