package EXERCISES.MY_EXERCISE.VARIABLE;

public class Variable_1 {
    static byte zm_a = 0b0100010, zm_j = 111;
    static boolean zm_b = true;
    static char zm_c = 60, zm_d = 'c';
    double zm_e = 3.00;
    float zm_f = 5;
    short zm_g = 23546;
    int zm_h = 443456537;
    long zm_i = 232432445;

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(zm_a) + " Zmienna typu byte (8 bitowa liczba).");
        System.out.println(Integer.toBinaryString(zm_j) + " Zmienna typu byte (8 bitowa liczba).");
        System.out.println(zm_b + " Zmienna typu boolean (może przyjmować wartości \"true\" lub \"false\").");
        System.out.println(zm_c + " Zmienna typu char (może przyjmować pojedyńcze znaki (zgodnie z tablicą ASCI).");
        System.out.println(zm_d + " Zmienna typu char (można wpisywać pojedyńczy znak lub odpowiednik w kodzie ASCI).");

    }
}
