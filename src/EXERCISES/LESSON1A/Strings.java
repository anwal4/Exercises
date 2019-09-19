package EXERCISES.LESSON1A;

public class Strings {
    public static void main(String[] args) {
        String words = "Mam do wykonania ";
        String last = " zadań.";
        int myCar = 100;
        char c = '{' + 1; //Wpisuje znak zwiększony o 1, tj. zamiast { jest |
        String words1 = "Dziś postaram się zrobić ";
        System.out.println(words + myCar + last);
        System.out.println(words1 + myCar / 2 + "." + c);
        final long MOON_SIZE = 0X124; //Typ szesnaskowy 0X124
        final long MOON_SIZE1 = 0124;
        //final long MOON_SIZE2 = 0b124;
        System.out.println("Powierzchnia księżyca wynoasi " + MOON_SIZE + " km kwadratowych.");
        System.out.println("Srednica księżyca wynoasi " + MOON_SIZE1 + " km");
        //System.out.println("Promień księżyca wynoasi " + MOON_SIZE2 + " km.");

    }
}
