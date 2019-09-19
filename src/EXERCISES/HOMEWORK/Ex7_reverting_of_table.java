package EXERCISES.HOMEWORK;

import java.util.Arrays;

public class Ex7_reverting_of_table {
    //Odwróć tablice jedno wymiarową.
    public static void main(String[] args) {
        int anArray[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Tablica oryginalna " + Arrays.toString(anArray));
        int reversArray[] = new int[anArray.length];
        int j = 0;
        for (int i = anArray.length - 1; i >= 0; i--) {
            reversArray[j++] = anArray[i];
        }
        System.out.println("Tablica odwrócona " + Arrays.toString(reversArray) + "\n");

    }
}
