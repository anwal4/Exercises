package EXERCISES.LESSON2;

public class Ex30 {
    public static void main(String[] args) {

        foo(new int[]{1, 2, 3});
        bar(new int[]{1, 2, 3});
        bar(1, 2, 3);
    }

    static void foo(int[] array) {
        System.out.println("foo");
    }

    static void foo(Integer[] array) {
        System.out.println("foo");
    }

    static void bar(int... array) {
        System.out.println("bar");
    }
}
