package EXERCISES.LESSON1;

public class Ex10_petle_for {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();

        // Mozna uzyc StringBuilder lub StringBuffera
        String wynik = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                wynik += "X";
            }
            wynik += "\n";
        }
        System.out.println(wynik);


    }
}
