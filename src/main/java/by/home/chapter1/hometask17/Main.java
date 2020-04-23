package by.home.chapter1.hometask17;

public class Main {
    public static void main(String[] args) {
        int lengthArray = 6; //Длина массива
        int myArray[][] = new int[lengthArray][lengthArray];

        for (int i = 0; i <= lengthArray / 2; i++) {    //идем по матрице
            if ((i == lengthArray / 2) & (lengthArray % 2 == 0)) {
                continue;
            } //хитрое условие - если четная длина массива - не заполнять сроднюю строку - ее нету

            for (int j = 0; j < lengthArray; j++) {
                if ((j < i) || (j >= lengthArray - i)) {
                    myArray[i][j] = 0;
                    myArray[lengthArray - i - 1][j] = 0;
                } else {
                    myArray[i][j] = 1;
                    myArray[lengthArray - i - 1][j] = 1;
                }
            }
        }
        for (int i = 0; i < lengthArray; i++) { //выводим результат на экран
            for (int j = 0; j < lengthArray; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();

        }
    }
}
