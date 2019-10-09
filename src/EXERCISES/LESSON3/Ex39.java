package EXERCISES.LESSON3;

import java.util.Random;
import java.util.function.*;

public class Ex39 {

    Function<Integer, Integer> f = integer -> integer * integer;

    Consumer<String> display = System.out::println;

    Predicate<Integer> isEven = arg -> arg % 2 == 0;

    Random r = new Random();
    Supplier<Integer> generate = r::nextInt;

    UnaryOperator<Integer> f2 = arg -> f.apply(arg);

    BiFunction<Integer, Integer, Integer> max =
            (a1, a2) -> a1 > a2 ? a1 : a2;


}
