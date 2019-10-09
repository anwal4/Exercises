package EXERCISES.LESSON3;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex41 {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.iterate(0, i -> i+1);

        List<Integer> result = integerStream
                .limit(101)
                .collect(Collectors.toList());

        System.out.println(result);

        List<Integer> result2 = Stream.iterate(1, i -> i+1)
                .filter(i -> i % 3 == 0 || i % 4 == 0)
                .limit(30)
                .collect(Collectors.toList());

        System.out.println(result2);

        List<Integer> result3 = Stream.iterate(1, i -> i+1)
                .filter(Ex41::isPrime)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(result3);
    }

    static boolean isPrime(long n) {
        return LongStream.range(2, n)
                .allMatch(i -> n % i != 0);
    }
}
