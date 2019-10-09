package EXERCISES.LESSON3;

public class Ex34 {
    public static void main(String[] args) {
        ExFoo o = new ExFoo();
        o.foo(new String("123"));
        o.foo(new Integer(123));

        System.out.println(o.bar());
    }


}

class ExFoo {

    <T> void foo(T t) {
      System.out.println(t);
    }

    <T extends Number> T bar() {
      return (T) new Integer(33);
    }

    <T> T foo2(T t) {
        return t;
    }


}
