package Lab_4;

import java.util.Random;

public class Exam_6 {
    public static void main(String[] args) {
        int y = 3;
        int x = 5;
        Random rndMass = new Random();
        int[][] mass = new int[y][x];
        for(int i=0;i<y; i++){
            mass[i] = new int[rndMass.nextInt(100)];
            for (int j=0; j<x; j++){
                mass[i][j] = rndMass.nextInt(100);
                System.out.print(mass[i][j]+ "  ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        int delY = rndMass.nextInt(3);
        int delX = rndMass.nextInt(5);
        System.out.println("Удалена строка №" + delY + " и столбик №" + delX);
        System.out.println("===============================");

        int[][] secondMass = new int[y-1][x-1];
        for(int i=0,s=0; i<y-1; s++){
            if (s!=delY-1){
                for (int j=0,k=0; j<x-1; k++){
                    if(k!=delX-1){
                        secondMass[i][j] = mass[s][k];
                        System.out.print(secondMass[i][j] + "  ");
                        j++;
                    }
                }
                System.out.println();
                i++;
            }
        }
    }
}
