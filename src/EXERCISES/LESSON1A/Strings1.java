package EXERCISES.LESSON1A;

public class Strings1 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.charAt(1));
        System.out.println(s.compareTo("witaj"));
        System.out.println(s.isEmpty());
        System.out.println(s.replace("l", "w"));

        // Zadania: przypisanie String dwoma sposobami
        String zdanie1 = "Za rok";
        String zdanie2 = new String(" już wakacje.");
        System.out.println(zdanie1+zdanie2);
        System.out.println(zdanie1 + zdanie2.replace("wakacje", "ferie"));


        String s1 = "hello";
        String s2 = new String ("hello");
        System.out.print(s1 == s2);//Będzie false ponieważ dane były przypisane w różny sposób
        System.out.print(s1.equals(s2));//Jest to bardziej inteligentna metoda do zadania ww.

        s1 = "Ala ma kota";
        char[] chars = s1.toCharArray();
        chars[4] = 'X';
        s1 = new String(chars);
        System.out.println(s1);

        String s5 = new String("Ala");
        String s6 = s5.substring(0, 2);
        System.out.print(s5);
        System.out.print(s6);
        System.out.print(s5 == s6);
    }
}
