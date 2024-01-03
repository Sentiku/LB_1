package Lab_6.les_4;

public class Base {
    static public void method(int x){
        int f = 1;
        if (x % 2 == 0) {
            for (int i = 0; x>=2;i++){
                f = f * (x);
                x = x-2;
            }
            System.out.println(f);
        }
        else {
            for (int i=0; x>=1; i++){
                f = f * (x);
                x = x-2;
            }
            System.out.println(f);
        }
    }
}
