package EXERCISES.LESSON1;

public class Ex6A_strings {
    public static void main(String[] args) {

        String label1 = "ala";

        // czy Palindrom
        boolean islabel1APalindrome = true;
        for (int i = 0; i < label1.length() / 2; i++) {
            if (label1.charAt(i) == label1.charAt(label1.length() - 1 - i)) {
                islabel1APalindrome = false;
            }
        }
        String opis = islabel1APalindrome ? "jest" : "nie jest";
        System.out.println(label1 + ":" + opis);


        // Odrwacanie
        String toReverse = "Czesc co u Ciebie";

        String result = "";
        for (int i = toReverse.length() - 1; i >= 0; i--) {
            result += toReverse.charAt(i);
        }
        System.out.println(result);

        // Wszystkie cyfry w napisie
        String lablelWithDigts = "Czy pamietasz 5 Maja 2016 roku?";

        String result2 = "";
        for (int i = 0; i < lablelWithDigts.length(); i++) {
            char currentChar = lablelWithDigts.charAt(i);
            if (currentChar > 47 && currentChar < 57) {
                result2 += currentChar;
            }
        }
        System.out.println(result2);

        // Czy znak w tablic znakow;
        char[] array = {'a', 'b', 'c', 'x'};
        char searchFor = 'b';
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchFor) {
                found = true;
            }
        }
        System.out.println("found = " + found);
    }
}
