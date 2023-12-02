package Lab_1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = in.nextLine();
        System.out.println("Сколько вам лет?");
        int age = in.nextInt();
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        in.close();
    }
}