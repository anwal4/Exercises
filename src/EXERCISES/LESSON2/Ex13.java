package EXERCISES.LESSON2;

public class Ex13 {

    public static void main(String[] args) {
        // new & value of
        Integer byNew = new Integer(12);
        Integer byValueOf = Integer.valueOf("12");

        System.out.println(byNew);
        System.out.println(byValueOf);

        // equals
        System.out.println(byNew.equals(byValueOf));
        System.out.println(byNew == byValueOf);

        // equals
        int lowInt = 12;
        System.out.println(byNew.equals(lowInt));
        // ==
        System.out.println(byNew == lowInt);
        System.out.println(byValueOf == lowInt);

        // assign
        int newInt = byNew;
        Integer bigInt = 12;


    }
}
