package EXERCISES.LESSON1A;

import java.util.Arrays;

public class Multiplaying {
    public static void main(String[] args) {

        String wynik = "";
        long start = System.nanoTime();
        for (int i = 1; i <= 10000; i++) {
            wynik += i;
        }
        long end = System.nanoTime();
        System.out.print(end - start); //Oblicza czas wykonania zadania - operacji.

        int[][] arrD7 = new int[3][3];
        arrD7[1] = new int[]{1, 1, 1};
        for (int i = 0; i < 3; i++) {
            System.out.print(Arrays.toString(arrD7[i]));
        }


    }
}
