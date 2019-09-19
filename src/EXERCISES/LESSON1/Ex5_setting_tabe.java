package EXERCISES.LESSON1;

public class Ex5_setting_tabe {
    public static void main(String[] args) {

        // Rozne sposoby deklaracji zmiennej typu tablicowego i przypisania do niej wartosci
        int tab1[] = new int[10];
        int tab2[] = new int[]{1, 2, 3};
        int tab3[] = {1, 2, 3};

        int[] tab2d1[] = new int[10][10];
        int tab2d2[][] = new int[2][];
        tab2d2[0] = new int[2];
        tab2d2[1] = new int[2];

        // Tablice dwu wymiarowe

        int[][] tab2d3 = {{1}, {2}};
        int[][] tab2d4 = new int[][]{{1}, {2}};


        int[][] tab2d5 = new int[2][];
        tab2d5[0] = new int[]{1, 2, 3};
        tab2d5[1] = new int[2];

    }
}
