package EXERCISES.HOMEWORK;

public class Ex4_char_frequency {
    //Dla podanego bardzo dlugiego napisu, policz czestostliwość występowania poszczególnych liter.
    public static void main(String[] args) {
        String s1 = new String("Hello. This is wonderful world.");
        int a = 0;
        char c = 65, d = 97;
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == c || s1.charAt(j) == d) {
                    a++;
                }
            }
            System.out.println(c + " lub " + d + " ---> " + a);
            c++;
            d++;
            a = 0;
        }

    }
}
