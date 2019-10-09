package EXERCISES.LESSON3A.teacher_work;

import java.util.function.Function;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {

        Function<String, Integer> len = str -> str.length();
        Function<String, Integer> len2 = String::length;

        Predicate<String> isCapitalized = str -> str
                .toUpperCase()
                .equals(str);

    }
}
