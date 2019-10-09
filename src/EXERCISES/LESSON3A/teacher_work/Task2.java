package EXERCISES.LESSON3A.teacher_work;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {

        A1 b = new B1();
        try {
            b.openFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

class A1 {
    void openFile() throws IOException {

    }
}

class MyIOException extends IOException {

}

class B1 extends A1 {
    @Override
    void openFile() throws MyIOException {
        System.out.println("B1 foo");
        throw new MyIOException();
    }
}
