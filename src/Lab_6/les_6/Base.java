package Lab_6.les_6;

public class Base {
    static public void method (int z, int... m) {
        int[] f = new int[z];
        if (z > m.length) {
            for (int i = 0; i < m.length; i++) {
                f[i] = m[i];
                System.out.print(f[i]);
            }
        }
        else {
            for (int i = 0; i < z; i++) {
                f[i] = m[i];
                System.out.print(f[i]);
            }
        }
    }
}
