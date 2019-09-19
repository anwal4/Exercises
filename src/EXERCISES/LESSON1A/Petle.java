package EXERCISES.LESSON1A;

public class Petle {
    //    public static boolean dodaj(int i) {
//        dodaj
//    }

    // public static void main(String[] args) {
    //     for (int i= 0; sprawdz(i) ; i = dodaj(i){
    //         System.out.println(i);
    //     }
    // }

    public static void main(String[] args) {
        for (int i = 0; i < +10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            i++;//Powoduje wyświetlenie parzystych lub co dwie liczby
        }
        for (int i = 0; i <= 10; i += 2) {//Powoduje wyświetlenie parzystych lub co dwie liczby
            System.out.println(i);
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= (2 - i); j++) {
                System.out.print("X");
            }

            System.out.print("\n");
        }

        String wynik = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                wynik += "X";
                wynik = wynik + "X";
                // System.out.print("\n");
            }
            //System.out.print("X");

            System.out.print(wynik);


        }

    }
}
