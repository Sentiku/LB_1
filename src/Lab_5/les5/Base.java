package Lab_5.les5;

public class Base {
    private int num;

    void setNum() {

        this.num = 0;
    }
    void setNum(int n) {
        num = n;
        if (n >= 100) {
            num = 100;
        }
    }
    Base (int num){
        this.setNum(num);
    }
    int getNum(){

        return num;
    }
}
