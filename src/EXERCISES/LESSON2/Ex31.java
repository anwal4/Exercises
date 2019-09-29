package EXERCISES.LESSON2;

public class Ex31 {

    public static void main(String[] args) {

        System.out.println(power(2, 4));
        System.out.println(sum(10));
        System.out.println(silnia(30));
    }

    static long silnia(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * silnia(n-1);
        }
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n-1);
        }
    }

    static int power(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * power(x, n-1);
        }
    }
}

