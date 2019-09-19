package EXERCISES.HOMEWORK;

import java.util.Arrays;
/*
    Odwróc tablice dwu wymiarowa (wartość znajdująca się na pozycji (x, y) powinna znalezdz sie na pozycji (y, x))
    A) Latwe rozwiazanie: korzystając z tablicy pomocniczej
    B) Trudniejsze rozwiązanie: nie korzystając z tablicy pomocniczej
     */
    /* A00 B01 C02 D03 E04      A00 F01 K02 P03 V04
       F10 G11 H12 I13 J14      B10 G11 L12 R13 W14
       K20 L21 M22 N23 O24      C20 H21 M22 S23 X24
       P30 R31 S32 T33 U24      D30 I31 N32 T33 Y34
       V40 W41 X42 Y43 Z44      E40 J41 O42 U43 Z44
     */
public class Ex8_reverting_table1 {
    public static void main(String[] args) {
        char[][] anArray = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'}, {'K', 'L', 'M', 'N', 'O'},
                {'P', 'R', 'S', 'T', 'U'}, {'V', 'W', 'X', 'Y', 'Z'}};
        char[][] revertedArray = new char[anArray.length][anArray.length];
        System.out.println("Oryginalna tablica:");
        for (int a = 0; a < anArray.length; a++) {
            System.out.println(Arrays.toString(anArray[a]));
        }
        System.out.println("\nOdwrócona tablica:");
        for (int i = revertedArray.length - 1; i >= 0; i--) {
            for (int j = revertedArray.length - 1; j >= 0; j--) {
                revertedArray[j][i] = anArray[i][j];
            }
        }
        for (int a = 0; a < revertedArray.length; a++) {
            System.out.println(Arrays.toString(revertedArray[a]));
        }
    }

}
