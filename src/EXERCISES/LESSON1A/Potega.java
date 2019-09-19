package EXERCISES.LESSON1A;

public class Potega {
    public static void main(String[] args) {
        int[] arrD6 = new int[10];
        for (int i = 0; i < arrD6.length; i++) {
            arrD6[i] = (i + 1) * (i + 1);
            System.out.format("%4d", arrD6[i]);
        }
    }
}
