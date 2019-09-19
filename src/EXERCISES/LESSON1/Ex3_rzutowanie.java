package EXERCISES.LESSON1;

public class Ex3_rzutowanie {
    public static void main(String[] args) {
        /*
        Rzutowanie typu wiekszego do mniejszego
         */
        int l = (int) 10L;
        int i = l;

        /*
        Rzutowanie typu wiekszego do mniejszego z przekroczeniem
        zakresu
         */
        short s = 128;
        byte b = (byte) s;
        System.out.println(b);
        /*
        Mozemy zauwazyć ze wartość się "zawinela"
        Czyli wartosći w byte 126, 127, -128, -127
         */

        /*
        Rzutowanie do booleana(zakomentowane bo nie kompiluje się)
         */
        int x = 1;
//        boolean b = (boolean)x;

    }
}
