package Lab_6.les_10;

public class Base {
    static public int[] method(int... a) {
        int[] res = new int[2];
        int max = a[0];
        int min = a[0];
        for (int i=0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        res[0] = min;
        res[1] = max;
        return res;
    }
}
