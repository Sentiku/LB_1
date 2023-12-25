package Lab_5.les3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int int1 = in.nextInt();
        System.out.println("Введите второе число");
        int int2 = in.nextInt();

        Base ex1 = new Base();
        Base ex2 = new Base(int1);
        Base ex3 = new Base(int1, int2);
    }
}
