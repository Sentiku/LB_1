package Lab_3;

import java.util.Scanner;

public class Exam_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        int n = in.nextInt();

        int sum, x=1, y=1;

        int[] arrayInt = new int[n];
        System.out.println(" " + x);
        System.out.println(" " + y);
        for (int i=0; i < n-2; i++){
            sum = x + y;
            x = y;
            y = sum;
            System.out.println(" " + sum);
        }

    }
}
