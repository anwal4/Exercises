package EXERCISES.HOMEWORK;

import java.util.Arrays;

public class Ex8B_reverting_table {
    public static void main(String[] args) {
        char[][] anArray = new char[][]{{'a', 'b', 'c', 'd', 'e'}, {'f', 'g', 'h', 'i', 'j'}, {'k', 'l', 'm', 'n', 'o'},
                {'q', 'p', 'r', 's', 't'}, {'u', 'v', 'w', 'x', 'y'}};
        System.out.println("Tablica oryginalna:");
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(Arrays.toString(anArray[i]));
        }
        char zm1, zm2;
        for (int i = 0; i < anArray.length; i++) {
            for (int j = i; j < anArray.length; j++) {
                zm1 = anArray[i][j];
                zm2 = anArray[j][i];
                anArray[j][i] = zm1;
                anArray[i][j] = zm2;
            }
        }
        System.out.println("\nTablica odwrócona:");
        for (int i = 0; i < anArray.length; i++) {
            System.out.println(Arrays.toString(anArray[i]));
        }
    }
}
