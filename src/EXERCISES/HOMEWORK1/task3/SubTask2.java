package EXERCISES.HOMEWORK1.task3;

import java.util.Arrays;

public class SubTask2 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        int[] tempTab = new int[tab.length];
        // copy values
        for(int i = 0; i < tab.length; i++) {
            tempTab[i] = tab[i];
        }
        tab = new int[10];
        for (int i = 0; i < tempTab.length; i++) {
            tab[i] = tempTab[i];
        }

        System.out.println(Arrays.toString(tab));
    }

}
