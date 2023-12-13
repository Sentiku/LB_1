package Lab_3;

import java.util.Scanner;

public class Exam_3_v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        int n = in.nextInt();

        int sum, x=1, y=1, i=0;

        int[] arrayInt = new int[n];
        System.out.println(" " + x);
        System.out.println(" " + y);

        do {
            sum = x + y;
            x = y;
            y = sum;
            i++;
            System.out.println(" "+ sum);
        }
        while (i < n-1);
    }
}
