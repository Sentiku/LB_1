package Lab_1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой сейчас месяц?");
        String month = in.nextLine();
        System.out.println("Сколько дней в этом месяце?");
        int day = in.nextInt();
        System.out.println("В месяце " + month + " " + day + " количество дней");
        in.close();
    }
}
