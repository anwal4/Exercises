package EXERCISES.LESSON1;

public class Ex4_operacje_mat {
    public static void main(String[] args) {
        // Operatory matematyczne
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(2 * 3);
        System.out.println(5 / 2); // wazne że całkowite
        System.out.println(5 % 2);

        // Operatory bitowe
        int five = 0b101;
        System.out.println(five);
        System.out.println("five >> 1");
        System.out.println((five >> 1) + " " + Integer.toBinaryString(five >> 1));
        System.out.println("five << 1");
        System.out.println((five << 1) + " " + Integer.toBinaryString(five << 1));
        System.out.println("five >>> 1");
        System.out.println((five >>> 1) + " " + Integer.toBinaryString(five >>> 1));
        int minusFive = -5;
        System.out.println(minusFive + " " + Integer.toBinaryString(minusFive));
        System.out.println("minusFive >> 1");
        System.out.println((minusFive >> 1) + " " + Integer.toBinaryString(minusFive >> 1));
        System.out.println("minusFive >>> 1");
        System.out.println((minusFive >>> 1) + " " + Integer.toBinaryString(minusFive >>> 1));

        // Modulo dla ujemnych
        System.out.print("-10 % 3 = ");
        System.out.println(-10 % 3);

        // Module dla dziesietnych
        System.out.print("10.0 % 3 = ");
        System.out.println(10.0 % 3);
        System.out.print("9 % 3.5 = ");
        System.out.println(9 % 3.5);

        // Wzor pitagorasa
        int a = 3;
        int b = 4;
        double c = Math.sqrt(a * a + b * b);
        System.out.print("SQRT(A^2 + B^2) = ");
        System.out.println(c);

        // Finfal & ++
        final int myConstant = 10;
        // Kod ponizej zakomentowany bo nie kompiluje sie
//        myConstant++;
    }
}
