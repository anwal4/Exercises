package EXERCISES.LESSON1;

public class Ex1_Zmienne {
    public static void main(String[] args) {
        /*
         Przypisanie zmiennej jednego typu do zmiennej innego typu
          */
        int i = 5;
        int l = i;

        /*
        Przypisanie zbyt dużej wartośći do zmiennej
         */
//        byte b = 129;
        /*
        Korzystanie z symboli D, F, L
         */
        long l2 = 129L;
        float f1 = 1.0F;
        double d2 = 1.0D;

        // Przypisanie wartości do zmiennej typu char
        char c1 = 67;
        char c2 = 'C';
        System.out.println(c1);
        System.out.println(c2);

        /*
        Przypisanie czar do zmiennej liczbowej
         */
        int i3 = c1;
        System.out.println(i3);

        /*
        Nadpisanie zmiennej
         */
        int x = 3;
        x = 4;
        System.out.println(x);

        /*
        Stwórz stałą korzystając jednego wyrażenia.
         */
        final double PI = 3.14;
        /*
        Stwórz stałą korzystając z dwóch wyrażeń
        */
        final long MOON_SIZE;
        MOON_SIZE = 123L;

    }
}
