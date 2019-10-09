package EXERCISES.LESSON3A;

public class Task1 {
    public static void main(String[] args) {

        Triple<Integer, Long, Double> t =
                new Triple<>(1, 2L, 3.0);

        Triple<String, String, String> t1 =
                new Triple<>("a", "b", "c");
    }
}

class Triple<A,B,C> {
    final A a;
    final B b;
    final C c;

    Triple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
