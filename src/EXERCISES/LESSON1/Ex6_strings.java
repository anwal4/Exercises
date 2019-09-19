package EXERCISES.LESSON1;

public class Ex6_strings {
    public static void main(String[] args) {

        // inicjalizacja zmiennej typu string
        String s1 = "Hello";
        String s2 = new String("Hello");

        // == vs equals
        System.out.println(s1 == "hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // laczenie napisów
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);

        // usuwanie białych znaków
        // podany sposob usuwa tylko na koncu i na poczatku
        System.out.println(" mam spacje na ".trim());

        // Podany sposob usuwa tylko spacje
        System.out.println("mam spacje\tna ".replace(" ", ""));

        // Dziala rowniez dla tabów i nawet nowych lini
        System.out.println(" mam\nspacje i tab i nawet nowa linie\tna ".replaceAll("\\s", ""));

        System.out.println("jestem maly Romek".toLowerCase());
        System.out.println("jestem maly Romek".toUpperCase());

        // Znajdz pozycje znaku
        System.out.println("Gdzie jest W".indexOf("W"));

        // Podmien litere
        String label = "ALA ma kota";
        // To rozwiazanie podmienia wszystkie A
        System.out.println(label.replace("A", "0"));

        // To rozwiazanie podmienia pierwsza A
        System.out.println(label.replaceFirst("A", "0"));

        // Jak podmienic np drugie A
        int pierwszaPozycjaA = label.indexOf("A");
        int drugaPozycjaA = label.indexOf("A", pierwszaPozycjaA + 1);
        String result = label.substring(0, drugaPozycjaA) + "X" + label.substring(drugaPozycjaA + 1);
        System.out.println(result);

        // Substring przy okazji pokazany
        // Wyrazenie regularne pokazane u gory przy okazji uzycia raplceAll \\s
    }
}
