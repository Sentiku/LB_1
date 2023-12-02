package Lab_1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой сегодня день недели?");
        String day = in.nextLine();
        System.out.println("Какой сейчас месяц?");
        String month = in.nextLine();
        System.out.println("Какой сегодня день в месяце по счёту?");
        int number = in.nextInt();
        System.out.println("Сегодня " + day + " " + number + " " + month);
        in.close();
    }
}
