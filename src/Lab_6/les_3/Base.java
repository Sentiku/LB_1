package Lab_6.les_3;

public class Base {
    static public void method(int... a) {
        int sum = 0;
        int max = a[0];
        int min = a[0];
        for (int i=0; i < a.length; i++) {
            sum += a[i];
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        double sr = (double)sum / a.length;
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + sr);
    }

}

