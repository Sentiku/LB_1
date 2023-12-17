package Lab_4;

public class Exam_7 {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int z = 0;
        int h = 0;
        int t = 0;

        int[][] mass = new int[x][y];
        for (int i=0; z< mass.length; z++){
            for(int j=0;j< (mass[i].length - h); j++){
                mass[i][j] = t;
                t++;
            }
            if (i < mass.length - 1){
                i++;
            }
            for (int o=x-1; o>h; o--){
                mass[o][mass.length - 1 - h] = t;
                t++;
            }
            h++;
        }
        for (int i=0; i<mass.length; i++){
            for (int j=0; j<mass[i].length; j++){
                System.out.print(mass[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
