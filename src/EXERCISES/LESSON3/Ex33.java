package EXERCISES.LESSON3;


public class Ex33 {

    public static void main(String[] args) {
        MyWrapper<Integer> w = new MyWrapper<>(12);
    }
}

class MyPair<A, B> {

    final A a;
    final B b;

    MyPair(A a, B b) {
        this.a = a;
        this.b = b;
    }
}

class MyWrapper<T extends Number> {
    private T t;

    MyWrapper(T t) {
        this.t = t;

    }
}
