package EXERCISES.LESSON3;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Ex42 {

    public static void main(String[] args) {
        Optional<Integer> maybeInteger = Optional.of(10);
        System.out.println(maybeInteger);

        Integer i = null;
        try {
            Optional<Integer> maybeInteger2 = Optional.of(i);
            System.out.println(maybeInteger2);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        Optional<Integer> maybeInteger3 = Optional.ofNullable(i);
        System.out.println(maybeInteger3);

        System.out.println(maybeInteger.equals(Optional.empty()));
        System.out.println(maybeInteger.equals(Optional.<Integer>empty()));

        Optional<String> newOptional = maybeInteger
                .map(x -> "str("+x.toString()+")");
        System.out.println(newOptional);

        if (newOptional.isPresent()) {
            System.out.println(newOptional.get());
        }

        newOptional.ifPresent(x -> System.out.println(x));

        try {
            System.out.println(Optional.empty().get());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }

        System.out.println(Optional.empty().orElse(0));

    }
}
