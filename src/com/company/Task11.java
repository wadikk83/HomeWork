package com.company;

public class Task11 {
    public static void main(String[] args) {
        int number = 12;
        boolean primeNumber = true;
        if (number<0) {number *=-1;}
        for (int i = 2; i < number ;i++) {
            if (number % i == 0) {primeNumber = false;}
        }
        System.out.println(primeNumber);


    }
}
