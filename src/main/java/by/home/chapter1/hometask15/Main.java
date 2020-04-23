package by.home.chapter1.hometask15;

public class Main {
    public static void main(String[] args) {
        //int marks[] = new int[10];
        int marks[] = {3, 4, 7, 8, 9, 3, 4, 5, 6, 7, 8, 5, 3, 1, 0, 4, 6, 3, 6};
        int minIndex = 0;
        int maxIndex = 0;
        int sumNumber = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > marks[maxIndex]) {
                maxIndex = i;
            }
            if (marks[i] < marks[minIndex]) {
                minIndex = i;
            }
        }
        for (int i = Math.min(minIndex, maxIndex) + 1; i < Math.max(minIndex, maxIndex); i++) {
            sumNumber += marks[i];
        }
        System.out.println(sumNumber);
    }
}
