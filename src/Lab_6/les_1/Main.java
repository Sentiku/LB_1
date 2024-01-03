package Lab_6.les_1;

public class Main {
    public static void main(String[] args) {
        char[] mass1 = {'f'};
        char[] mass2 = {'a', 'b', 'c'};

        Base A = new Base('A');
        System.out.println("One Char: " + A.getCh());

        Base B = new Base("Something");
        System.out.println("One String: " + B.getStr());

        Base C = new Base(mass1);
        System.out.println("First Massive: " + C.getCh());

        Base D = new Base(mass2);
        System.out.println("Second Massive: "+ D.getStr());
    }
}
