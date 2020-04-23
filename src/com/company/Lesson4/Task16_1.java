package com.company.Lesson4;

public class Task16_1 {
    public static void main(String[] args) {
        String stroka = new String("Hello World");
        char[] array = new char[stroka.length()];

        /*for (int i = 0; i < stroka.length(); i++) {
            array[i] = stroka.charAt(i);
        }  //переносим строку в массив*/
        stroka.getChars(0,stroka.length(),array,0);

        //выводим на экран
        for (char value : array) {System.out.print(value);};
        System.out.println();

        char temp; //временная переменная
        for (int i = 0; i <= array.length / 2 - 1; i++) { //переворачиваем
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        //выводим на экран
        for (char value : array) {System.out.print(value);}
        System.out.println();


        //еще один метод перевернуть строку
        StringBuffer stroka1 = new StringBuffer(stroka);
        System.out.println(stroka1.reverse());
    }
}
