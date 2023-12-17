package Lab_4;

public class Exam_4 {
    public static void main(String[] args) {

        int z = 0;
        int height = 5;
        int [][] figure = new int [height][];

        for (int i = 0; i < height; i++){
            figure[i] = new int [i+1];
            for (int j = 0; j <= i; j++){
                figure[i][j] = j+1;
            }
        }
        for (int i = 0; i < height; i ++){
            int count = i + 1;
            System.out.print("Номер строки "+ count + ": ");
            for (int j = 0; j < figure[i].length; j++){
                System.out.print(figure[i][j] + " ");
                z++;
            }
            System.out.println("Количество символов в строке: "+ z);
            z = 0;
        }

    }
}
