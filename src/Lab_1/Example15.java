package Lab_1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое простое число");
        int a = in.nextInt();
        System.out.println("Введите второе простое число");
        int b = in.nextInt();
        int s = a + b;
        int r = a - b;
        System.out.println("Сумма чисел равна " + s);
        System.out.println("Разность чисел равна " + r);
        in.close();
    }
}
