package com.company;

/**
 * The type Task 10.
 */
public class Task10 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int number = 258;
        int sumNumber = 0;
        if (number<0) {number*=-1;}
        for (;number >0 ;number /=10) {sumNumber+= number % 10;}
        System.out.println(sumNumber);
    }
}
