package EXERCISES.LESSON1A;

import java.util.Arrays;

public class Tabliczka_mnozenia {
    public static void main(String[] args) {
        int[][] arrD5 = new int[11][11];
        for (int i =0; i <=10; i++){
            for (int j = 0; j <=10; j++){
                arrD5[i][j] = i*j;
                System.out.format("%4d", arrD5[i][j]);
            }
            System.out.print("\n");
        }
    }
}
