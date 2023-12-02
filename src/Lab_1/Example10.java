package Lab_1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какого ты года рождения?");
        int year = in.nextInt();
        int age = 2023 - year;
        System.out.println("Твой возраст " + age);
    }
}
