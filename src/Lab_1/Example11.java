package Lab_1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = in.nextLine();
        System.out.println("Какой у вас год рождения?");
        int year = in.nextInt();
        int age = 2023 - year;
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        in.close();
    }
}
