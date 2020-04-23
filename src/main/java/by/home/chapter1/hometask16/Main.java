package by.home.chapter1.hometask16;

public class Main {
    public static void main(String[] args) {
        int lengthArray = 9;
        int[] array = new int[lengthArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }  //забиваем массив случайными значениями

        for (int value : array) {  //выводим на экран
            System.out.print(value + "   ");
        }
        System.out.println();

        int temp = 0; //временная переменная
        for (int i = 0; i <= array.length / 2 - 1; i++) { //переворачиваем
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int value : array) {
            System.out.print(value + "   ");
        }
    }
}
