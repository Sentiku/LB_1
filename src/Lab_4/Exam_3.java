package Lab_4;

public class Exam_3 {
    public static void main(String[] args) {

        int width = 10;
        int height = 5;
        int [][] figure = new int [height][width];
        int z = 0;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                figure[i][j] = 2;
            }
        }
        for (int i = 0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <width; j++){
                System.out.print(figure[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
