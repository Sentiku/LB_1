package Lab_6.les_7;

public class Base {
    static public int[] method(char... p){
        int [] r = new int[p.length];
        for (int i = 0; i < p.length; i++){
            r[i] = (int) p[i];
        }
        return r;
    }
}
