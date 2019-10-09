package EXERCISES.LESSON3;

import java.util.*;

public class Ex38 {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4, 1, 100, 1, 2, 3);

        for(int i : l) {
            System.out.print(i);
        }

        System.out.print("\n");

        Set<Integer> s = new TreeSet<>(l);
        for(int i: s) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        Map<String, String> map = new HashMap<>();
        map.put("a", "x");
        map.put("b", "y");

        for (Map.Entry<String, String> x: map.entrySet()) {
            System.out.println(x);
        }
    }
}
