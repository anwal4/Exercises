package EXERCISES.LESSON1;

public class Ex11_petle_while {
    public static void main(String[] args) {

        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(i1++ + " ");
        }

        System.out.println();
        int i2 = 10;
        do {
            System.out.print(i2-- + " ");
        } while (i2 >= 1);

        System.out.println();
        int i3 = 0;
        while ((i3 += 2) <= 20) {
            System.out.print(i3 + " ");
        }
        System.out.println();
        i3 = 0;
        while (i3 < 20) {
            System.out.print((i3 += 2) + " ");
        }

        System.out.println();
        i3 = 2;
        while (i3 <= 20) {
            System.out.print(i3 + " ");
            i3 += 2;
        }

    }
}
