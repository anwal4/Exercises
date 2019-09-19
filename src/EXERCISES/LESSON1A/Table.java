package EXERCISES.LESSON1A;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Table {
    public static void main(String[] args) {
        int[] anArray = new int[3];
        anArray[0] = 2;
        anArray[1] = 3;
        anArray[2] = 4;
        System.out.println("Pierwsza liczba tablicy " + anArray[0] + ", druga liczba tablicy " + anArray[1] + ", trzecia liczba tablicy " + anArray[2]);


        //przypisanie tabliczy dwuwymiarowej [2} [2]
        int[][] twoArray = new int[2][2];
        twoArray[0][0] = 9;
        twoArray[0][1] = 8;
        twoArray[1][0] = 7;
        twoArray[1][1] = 6;
        System.out.println("[0][0]=" + twoArray[0][0] + " [0][1]=" + twoArray[0][1] + " [1][0]=" + twoArray[1][0] + " [1][1]=" + twoArray[1][1]);
        int[][] treeArray = new int[][]{{1, 2}, {3, 4}};
        System.out.println("[0][0]=" + treeArray[0][0] + " [0][1]=" + treeArray[0][1] + " [1][0]=" + treeArray[1][0] + " [1][1]=" + treeArray[1][1]);
        //Wyświetlenie zawartości tablicy
        System.out.println(Arrays.toString(twoArray[0]));
        System.out.println(Arrays.toString(twoArray[1]));

        //Wpisanie daych do tablicy przez petle for
        int[][] fourArray = new int[2][2];
        for (int i = 0; i < fourArray.length; i++) {
            for (int j = 0; j < fourArray.length; j++) {
                fourArray[i][j] = i + j;
            }
        }
        //Wyświetlenie zawartości tablicy
        System.out.println(Arrays.toString(fourArray[0]));
        System.out.println(Arrays.toString(fourArray[1]));
    }
}
