package Lab_1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите простое число");
        int a = in.nextInt();
        int z = a - 1;
        int x = a + 1;
        int c = (a + z + x) * (a + z + x);
        System.out.println(+ z + " " + a + " " + x + " " + c);
        in.close();
    }
}
