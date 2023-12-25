package Lab_5.les3;

public class Base {
    private int int1;
    private int int2;

    Base() {
        System.out.println("Без аргумента");
    }

    Base(int int1) {
        System.out.println("С одним аргументом");
        this.int1 = int1;
        System.out.println(getOwnPow(int1));
    }
    public int getOwnPow (int int1) {
        this.int1 = int1;
        int result = 1;
        for(int i = 1; i<=int1; i++){
            result = int1 * result;
        }
        return result;
    }
    Base(int int1, int int2){
        System.out.println("С двумя аргументами");
        this.int1 = int1;
        this.int2 = int2;
        System.out.println(getPow (int1, int2));
    }
    public int getPow(int n1, int n2){
        n1 = int1;
        n2 = int2;
        int result = 1;
        for (int i=1; i<=int2; i++){
            result = int1 * result;
        }
        return result;

    }


}
