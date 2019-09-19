package EXERCISES.LESSON1A;

import java.util.Arrays;
/* Wyświetla tablicę
[1, 1, 1, 1]
[1. 0. 0, 1]
[1, 0, 0, 1]
[1, 1, 1, 1]
 */

public class Task1 {
    public static void main(String[] args) {
        int[][] arrD8 = new int[4][4];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if ((i == 1 & j == 1) || (i == 1 & j == 2) || (i == 2 & j == 1) || (i == 2 & j == 2)) {
                    arrD8[i][j] = 0;
                } else {
                    arrD8[i][j] = 1;
                }
            }
            System.out.print(Arrays.toString(arrD8[i]));
            System.out.print("\n");
        }
    }
}
