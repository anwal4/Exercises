package EXERCISES.LESSON1A;

public class Palindrom {
    public static void main(String[] args) {
        String wyrazenie = "Ala i ala";
        wyrazenie.replaceAll(" ", "2");
        boolean czyjest = true;
        for (int i = 0; i <= wyrazenie.length() / 2; i++) {
            if (wyrazenie.charAt(i) != wyrazenie.charAt(wyrazenie.length() - 1 - i)) {
                czyjest = false;
            } else
                czyjest = true;
        }
        System.out.println("Zdanie " + wyrazenie);
        System.out.println("Jest palindromem - " + czyjest);


        String name = "To zdanie zostanie odwrócone.";
        String wynik = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            wynik += name.charAt(i);
        }
    }
}
