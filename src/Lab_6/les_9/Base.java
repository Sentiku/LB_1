package Lab_6.les_9;

public class Base {
    static public void method(char... p){
        for (int i = 0; i < p.length / 2; i++) {
            char temp = p[i];
            p[i] = p[p.length - i - 1];
            p[p.length - i - 1] = temp;
        }
    }
}
