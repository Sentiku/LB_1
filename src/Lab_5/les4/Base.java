package Lab_5.les4;

public class Base {
    private char ch1;
    private int int1;

    Base(int i, char b) {
        this.ch1 = b;
        this.int1 = i;
        int length = (int) (Math.log10(int1) + 1);
        double result = (double) ch1 + (double) int1 * 100 / Math.pow(10, length);
        System.out.println("result1 = " + result + "; ch = " + (double) ch1 + "; int = " + length);
    }
    Base(double d) {
        char ch1 = (char) d;
        int1 = (int) ((d - (int) d) * 100);
        System.out.println("ch = " + ch1 + "; int = " + int1);
    }
}
