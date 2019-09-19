package EXERCISES.LESSON1;

public class Ex8_petle_if {
    public static void main(String[] args) {

        if (2 < 3) {
            System.out.println("2 < 3");
        }

        if (4 > 5) {

        } else {
            System.out.println("4  > 5 == false");
        }

        if (4 > 5) {

        } else if (4 % 2 == 0) {
            System.out.println("4  > 5 == false ale 4 % 2 == 0 ");
        }

        if (false) {

        } else if (false) {

        } else {
            System.out.println("if else if else");
        }
    }
}
