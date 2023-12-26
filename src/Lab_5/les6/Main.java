package Lab_5.les6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        Base base = new Base(a);
        Base base2 = new Base(a,b);

        base.minMax(a);
        base.checkMinMax();

        base2.minMax(a,b);
        base2.checkMinMax();


    }

}
