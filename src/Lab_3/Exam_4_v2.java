package Lab_3;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_4_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = in.nextInt();
        int b = in.nextInt();

        int [] arrayInt = new int[2];
        arrayInt[0] = a;
        arrayInt[1] = b;

        Arrays.sort(arrayInt);
        System.out.println(arrayInt[0] + " " + arrayInt[1]);

    }
}
