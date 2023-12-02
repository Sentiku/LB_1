package Lab_1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое простое число");
        int a = in.nextInt();
        System.out.println("Введите второе простое число");
        int b = in.nextInt();
        int x = a + b;
        System.out.println("Сумма чисел равна " + x);
        in.close();
    }
}
