package Lab_3;

import java.util.Random;
import java.util.Scanner;

public class Exam_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] array = new int[size];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
        var min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);

    }
}