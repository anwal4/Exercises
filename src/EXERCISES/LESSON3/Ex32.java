package EXERCISES.LESSON3;

import java.util.logging.Level;
import java.util.logging.Logger;

class AX {
    void foo() throws MyException {
        throw new MyException();
    }
}

class BX extends AX {
    @Override
    void foo() throws MyRuntimeException {
        System.out.println("foo bx");
    }
}

public class Ex32 {

    protected static final Logger log = Logger.getGlobal(); //java.util.logging.Logger

    public static void main(String[] args) {
        try {
            throw_exception();
        } catch (MyException e) {
            log.log(Level.WARNING, e.getMessage(), e);
        }

        try {
            throw_runtime();
        } catch (MyRuntimeException e) {
            log.info(e.getLocalizedMessage());
        } catch (Exception e) {

        }
        // nie mozna
//        catch (MyException e) {
//
//        }

        try {
            multipleExceptions(true);
        } catch (MyException e) {
            e.printStackTrace();
        } catch (MyException2 myException2) {
            myException2.printStackTrace();
        }

        try {
            multipleExceptions(true);
        } catch (MyException|MyException2 e) {

        }
        catch (Exception e) {

        } finally {

        }

    }

    static void throw_exception() throws MyException {
        throw new MyException();
    }

    static void throw_runtime() {
        throw new MyRuntimeException();
    }

    static void multipleExceptions(boolean x)
            throws MyException, MyException2 {
        if (x) {
            throw new MyException();
        } else {
            throw new MyException2();
        }
    }
}

class MyException extends Exception {

}

class MyException2 extends Exception {

}

class MyRuntimeException extends RuntimeException {

}