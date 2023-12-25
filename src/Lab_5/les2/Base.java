package Lab_5.les2;

public class Base {
    private char ch1;
    private char ch2;

    public void setAllCh(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
    public void showCodeInt() {
        int a = ch1;
        int b = ch2;
        if (ch1 > ch2){
            a = ch2;
            b = ch1;
        }
        for (int i = a; i<=b; i++){
            System.out.println((char) i );
        }
    }
}
