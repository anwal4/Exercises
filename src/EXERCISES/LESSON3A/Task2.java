package EXERCISES.LESSON3A;

public class Task2 {
}

class MinMaxPair<T extends Comparable<T>> {
    final T a;
    final T b;

    MinMaxPair(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T max() {
        return a.compareTo(b)>0 ? a : b;
    }
}
