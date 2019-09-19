package EXERCISES.HOMEWORK;

/*
Podnies liczbe a do potegi b
 */
public class Ex9_Potega {
    public static void main(String[] args) {
        //Z wykorzystaniem pętli
        int a = 5, b = 4, c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        System.out.println(c);
        //Z wykorzystaniem funkcji MATH
        double d = Math.pow(a, b);
        System.out.println(d);
    }
}
