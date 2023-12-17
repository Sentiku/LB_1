package Lab_4;

import java.util.Random;

public class Exam_5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        Random random = new Random(200);
        int[][] mass = new int [x][y];
        for (int i = 0; i < x; i++){
            mass[i] = new int[random.nextInt(200)];
            for (int j = 0; j < y; j ++){
                mass[i][j] = random.nextInt(200);
                System.out.println("i = " + i + "; j = " + j + "; value = "+ mass[i][j]);
            }
        }
        System.out.println("Развернутый массив ниже");
        int[][] revMass= new int [y][x];
        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                revMass[i][j] = mass[j][i];
                System.out.println("i = " + i + "; j = " + j + "; value = "+ revMass[i][j]);
            }
        }

    }
}
