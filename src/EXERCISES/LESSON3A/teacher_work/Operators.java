package EXERCISES.LESSON3A.teacher_work;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = ++a * b--;
        /*
        a = 6
        b = 9
        c = 6 * 10
         */
        // c = 60
        // a = 6
        // b = 9
        System.out.println(c);
        int d = a-- + ++b;
        // a = 6 + 10 = 16
        System.out.println(d);
    }
}
