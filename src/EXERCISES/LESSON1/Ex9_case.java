package EXERCISES.LESSON1;

public class Ex9_case {
    public static void main(String[] args) {
        // prosty switch bez defaylt
        System.out.println("Pierwszy switch");

        switch (2) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }

        System.out.println("Drugi switch");

        // switch co nie obsluzy podannej wartosci
        switch (3) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
        System.out.println("Program wciaz dziala");

        int ocena = 6;
        switch (ocena) {
            case 5:
            case 6:
                System.out.println("brawo!!!");
                break;
        }

        /*
        to nie dziala
         */

//        int someVariable = 3;
//        switch (ocena) {
//            case 5:
//            case someVariable:
//                System.out.println("brawo!!!");
//                break;
//        }


        // TO juz dziala
        final int someVariable = 3;
        switch (ocena) {
            case 5:
            case someVariable:
                System.out.println("brawo!!!");
                break;
        }

        // ale nie juz dziala
//        final int someVariable2;
//        someVariable2 = 3;
//        switch (ocena) {
//            case 5:
//            case someVariable2:
//                System.out.println("brawo!!!");
//                break;
//        }
    }
}
