package EXERCISES.LESSON1;

public class Ex7_StringBuilder {
    public static void main(String[] args) {

        // String builder
        StringBuilder sb1 = new StringBuilder();

        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println(sb2.append("x"));
        System.out.println(sb2.insert(0, "P"));

        System.out.println(sb2.replace(1, 3, "W"));
        System.out.println(sb2.toString());


        // equls zwraca false bo inne typy
        System.out.println(sb2.equals("PWllox"));
        System.out.println("PWllox".contentEquals(sb2));
        System.out.println("PWllox".contentEquals(sb2));

        StringBuffer sbuf1 = new StringBuffer();

        StringBuffer sbuf2 = new StringBuffer("Hello");

        System.out.println(sbuf2.append("x"));
        System.out.println(sbuf2.insert(0, "P"));

        System.out.println(sbuf2.replace(1, 3, "W"));
        System.out.println(sbuf2.toString());

        // equls zwraca false bo inne typy
        System.out.println(sbuf2.equals("PWllox"));
        System.out.println("PWllox".contentEquals(sbuf2));
        System.out.println("PWllox".contentEquals(sbuf2));

        /*
        uwaga wiekszosc metod z StringBuilder jest dostepna w StringBuffer rowniez,
        wynika to z faktu, że te dwie klasy maja wspolnego przodka "AbstractStringBuilder"
         */

    }
}
