package Lab_3;

import java.util.Scanner;

public class Exam_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел нужно в массиве?");
        int n = in.nextInt();
        if (n < 1){
            System.out.println("Введи число больше 0");
        }
        int[] array = new int [n];
        int x = 0;
        int[] base = new int [n * 5];
        for (int b = 0; b < base.length; b++) {

            if (b % 5 == 2){
                array[x] = b;
                x++;
                System.out.println(b);
                base[b] = b + 1;
            } else {
                base[b] = b + 1;
            }
        }
    }
}
