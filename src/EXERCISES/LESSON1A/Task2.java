package EXERCISES.LESSON1A;

public class Task2 {
    public static void main(String[] args) {
        String var3 = "Tomek ma 6 lat i 5 krów";
        for (int i = 0; i < var3.length(); i++) {
            if (isDigith(var3.charAt(i))) {
                System.out.println(var3.charAt(i));
            }
        }
    }

    static boolean isDigith(char c) {
        char[] znaki = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean wynik = false;
        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] == c) {
                wynik = true;
            }
        }
        return wynik;
    }
}
