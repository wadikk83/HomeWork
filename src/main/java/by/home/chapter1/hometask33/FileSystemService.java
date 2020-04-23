package by.home.chapter1.hometask33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileSystemService implements FileSystemServiceInterface {
    @Override
    public void showFiles(String directory) throws IOException {
        //https://user12vv.wordpress.com/2018/01/26/java8-%D0%BA%D0%BB%D0%B0%D1%81%D1%81-files-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4-walk/
        //слизано отсюда
        //Files.walk(Paths.get(PATH_TO_FILES)).filter(Files::isRegularFile).filter(p -> p.toString().endsWith(".xml")).collect(Collectors.toList());
        List<Path> filesList = Files.walk(Paths.get(directory))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());
        for (Path path : filesList) {
            System.out.println(path);
        }
    }

    @Override
    public void showSubDirectory(String directory) throws IOException {
        List<Path> directoryList = Files.walk(Paths.get(directory))
                .filter(Files::isDirectory)
                .collect(Collectors.toList());
        for (Path path : directoryList) {
            System.out.println(path);
        }
    }
}


