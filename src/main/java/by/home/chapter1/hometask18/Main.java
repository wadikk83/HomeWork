package by.home.chapter1.hometask18;

public class Main {
    public static void main(String[] args) {
        String inputLine = "Привет! Это строка, в ко<>торой- надо посчитать! знаки ; препинания#$%";
        int countPunctuationMarks = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            if ((!Character.isLetterOrDigit(inputLine.charAt(i))) && (!Character.isSpaceChar(inputLine.charAt(i)))) {
                countPunctuationMarks++;
            }
        }
        System.out.println("Punctuation marks " + countPunctuationMarks + " pieces");

    }
}
