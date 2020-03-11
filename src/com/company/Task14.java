package com.company;

public class Task14 {
    public static void main(String[] args) {
        int rating[] = new int[10];    //заводим массив rating длиной 10
        for (int i = 0; i < rating.length; i++) {
            rating[i] = (int) (Math.random() * 10);
        } //заполняем случайным образом
        int maxValue = rating[0];
        for (int i = 0; i < rating.length; i++) {  //ищем максимальное значение
            if (rating[i] > maxValue) {
                maxValue = rating[i];
            }
        }
        for (int i = 0; i < rating.length; i++) {  //выводим массив на экран
            System.out.print(rating[i]);
        }
        System.out.println();
        System.out.println("Максимальное значение в массиве " + maxValue);
        System.out.println("Номер позиции ");
        for (int i = 0; i < rating.length; i++) {  //позиций с максимальным значением может быть несколько
            if (rating[i] == maxValue) {
                System.out.print(i);
            }
        }
        System.out.println();
        //сортировка методом пузырька
        int temp; //временная переменная
        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < rating.length; j++) {
                if (rating[i] < rating[j]) {
                    temp = rating[i];
                    rating[i] = rating[j];
                    rating[j] = temp;
                }
            }
        }
        for (int i = 0; i < rating.length; i++) {  //выводим массив на экран
            System.out.print(rating[i]);
        }
    }
}
