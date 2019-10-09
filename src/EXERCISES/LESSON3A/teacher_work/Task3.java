package EXERCISES.LESSON3A.teacher_work;

import java.io.Closeable;

public class Task3 {

    public static void main(String[] args) {

        try(X x = new X()){
            x.foo();
        } catch (RuntimeException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }

}

class X implements Closeable {

    void foo() {
        throw new IllegalArgumentException();
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
