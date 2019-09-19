package EXERCISES.LESSON1A;

import java.time.DayOfWeek;

public class Instrukcje_Sterujace {
    public static void main(String[] args) {
        //Instrukcja sterująca IF
        if (true) {
            System.out.println("Wartość prawdziwa.\n");
        } else {
            System.out.println("Wartość falszywa.\n");
        }

        int wynik = 10;
        if (wynik < 11) {
            System.out.println("Mniej niż 10.");
        } else {
            System.out.println("Więcej niż 10.\n");
        }

        //Instrukcja sterująca SWITCH
        int ocena = 1;
        switch (ocena) {
            case 1:
                System.out.println("Nie zdałeś.");
                break;
            case 2:
                System.out.println("Ledwo, ledwo zdałeś.");
                //break;
            case 3:
                System.out.println("Brawo, zdałeś.");
                //break;
            case 4:
                System.out.println("Brawo, zdałeś znakomicie.");
                break;
            default:
                System.out.println("Jeszcze się zastanawiam");
        }


        short rezultat;
        rezultat = 8;
        switch (rezultat) {
            case 1:
                System.out.println("Nie wykonano zadania.");
                break;
            case 2:
                System.out.println("Ledwo, ledwo się wyrobiłeś.");
                break;
            case 3:
                System.out.println("Brawo, wyrobiłeś się w czasie.");
                break;
            case 4:
                System.out.println("Brawo, zrobiłeś więcej niż planowano.");
                break;
            default:
                System.out.println("Jeszcze czekam na koniec pracy.\n");
        }

        //Instrukcja sterująca SWITCH ze zmienną
        int grade = 4;
        final String gradeLabel;//Zmienna gradeLabel
        switch (grade) {
            case 1:
                gradeLabel = "Fail";
                break;
            case 3:
                gradeLabel = "Not bad";
                break;
            case 5:
                gradeLabel = "Super";
                break;
            default:
                gradeLabel = "Not Suported";
                //break;
        }
        System.out.println(gradeLabel);


        DayOfWeek today = DayOfWeek.FRIDAY;
        switch (today) {
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
            default:
                break;

        }
    }
}

