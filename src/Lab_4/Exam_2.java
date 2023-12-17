package Lab_4;

public class Exam_2 {
    public static void main(String[] args) {
        int figure = 8;
        int z;

        for (int i = 1; i <= figure; i++){
            System.out.print("Номер строки: " + i);
            z = 0;
            for (int j = 0; j < i; j++ ){
                System.out.print("+");
                z = z +1;
            }
            System.out.println(" Количество символов в строке "+ z);
        }
    }
}
