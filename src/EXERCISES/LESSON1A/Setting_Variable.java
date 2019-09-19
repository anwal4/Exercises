package EXERCISES.LESSON1A;

import java.util.Arrays;

public class Setting_Variable {
    public static void main(String[] args) {
        int a;
        a = 5;
        short b = 20;
        int c = a + b;
        System.out.println("c= " + c);// Zmienna a  została zdeklarowana


        int[] Array1 = new int[3];
        Array1[0] = 1;
        Array1[1] = 2;
        Array1[2] = 3;
        System.out.println(Arrays.toString(Array1));


        int[] anArray1 = new int[]{4, 5, 6};
        System.out.println(Arrays.toString(anArray1));

        int[] anArray2 = {6, 7, 8};
        System.out.println(Arrays.toString(anArray2));


        //TABLICA DWUWYMIAROWA
        int[][] arr2D = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        System.out.println(Arrays.toString(arr2D));
        arr2D[0][0] = 1;
        arr2D[1][1] = 1;
        arr2D[2][2] = 1;
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr2D[2]));


        /*
        [
        0
        0 0
        0 0 0
        ]
        */
        int[][] arrD = new int[3][];
        arrD[0] = new int[]{0};
        arrD[1] = new int[]{0, 0};
        arrD[2] = new int[]{0, 0, 0};
        System.out.println(Arrays.toString(arrD[0]));
        System.out.println(Arrays.toString(arrD[1]));
        System.out.println(Arrays.toString(arrD[2]));

        int[][] arrD1 = new int[3][];
        arrD1[0] = new int[]{0, 0, 0};
        arrD1[1] = new int[]{0, 0};
        arrD1[2] = new int[]{0};
        System.out.println(Arrays.toString(arrD1[0]));
        System.out.println(Arrays.toString(arrD1[1]));
        System.out.println(Arrays.toString(arrD1[2]));

        ///////////////////////////////////
        int[][] arrD2 = new int[3][];
        arrD2[0] = new int[3];
        arrD2[1] = new int[2];
        arrD2[2] = new int[1];
        System.out.println(Arrays.toString(arrD2[0]));
        System.out.println(Arrays.toString(arrD1[1]));
        System.out.println(Arrays.toString(arrD1[2]));


        ///////////////////////////////////

        /*
        int[][] arrD3 = new int[3][];
        for (int i = 0; i < arrD3[i].length; i++) {
            for (int j = 0; j < arrD3[j].length; j++) {
                System.out.print(arrD3[i][j]);

                System.out.print("\n");
            }


        }

         */


    }
}
