package by.home.chapter2.hometask2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern ZIP_PATTERN = Pattern.compile("^[E,R,D]\\d{12}$");
    //private static final Pattern ZIP_PATTERN = Pattern.compile("(?<=\\d)\\s+(?=\\d+)");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter you WM wallet");
        String wm = scanner.nextLine();
        String newWm = wm.replaceAll("\\s", "");
        System.out.println("You inplfxf yf ut wallet is -> " + newWm);
        Matcher matcher = ZIP_PATTERN.matcher(newWm);
        if (matcher.matches()) {
            System.out.println("You WM wallet is OK");
        } else {
            System.out.println("You WM wallet is incorrect");
        }
    }
}
