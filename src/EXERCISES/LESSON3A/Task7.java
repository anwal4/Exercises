package EXERCISES.LESSON3A;

import java.util.function.Predicate;

public class Task7 {
    public static void main(String[] args) {

        Predicate<String> startsWithA = arg -> arg.startsWith("A");
        Predicate<String> startsWithA2 = arg -> arg.charAt(0) == 'A';
    }
}
