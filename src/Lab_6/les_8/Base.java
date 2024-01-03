package Lab_6.les_8;

public class Base {
    static public double method(int... p) {
        int sum = 0;
        for (int i=0; i < p.length; i++) {
            sum += p[i];
        }
        double sr = (double)sum / p.length;
        return sr;
    }
}
