package Lab_3;

import java.util.Scanner;

public class Exam_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел участвует?");
        int n = in.nextInt();
        int q = 0;
        int s = 0;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;

            if (i % 5 == 2 || i % 3 == 1){
                System.out.println(q + " + " + i);
                s = q + i;
                q = s;
            } else{
                continue;
            }
        }
        if (s == 0){
            System.out.println("Нет подходящих чисел");
        } else {
            System.out.println(s);
        }

    }
}
