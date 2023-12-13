package Lab_3;

import java.util.Scanner;

public class Exam_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a<b){
            System.out.println(a + " " + b);
        } else {
            System.out.println(b+ " " + a);
        }
    }
}
