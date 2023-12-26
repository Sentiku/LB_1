package Lab_5.les6;

public class Base {
    private int min = 0;
    private int max = 10;
    public Base(int a){}
    public void minMax(int a){
        for (int i=0; i<3; i++){
            if(a<min){
                min = a;
            }
            if(a>max){
                max = a;
            }
        }
    }
    public Base(int a, int b){}
    void minMax(int a,int b){
        for (int i=0; i<4; i++){
            if(a<min){
                min = a;
            }
            if(a>max){
                max = a;
            }
            if(b<a){
                min = b;
            }
            if(b>a){
                max = b;
            }
        }
    }
    void checkMinMax(){
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
