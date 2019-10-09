package EXERCISES.LESSON3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex40 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }

        List<Integer> result = l.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);

        int sum1 = l.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        int sum2 = l.stream().reduce(0, (a1, a2) -> a1 + a2);
        System.out.println(sum2);
    }
}
