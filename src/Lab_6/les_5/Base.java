package Lab_6.les_5;

public class Base {
    static public void method(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i*i;
        }
        System.out.println(sum);
    }
}
