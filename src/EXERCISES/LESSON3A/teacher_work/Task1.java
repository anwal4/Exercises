package EXERCISES.LESSON3A.teacher_work;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        Object[] tab= new Object[1];

        try {
            System.out.println(tab[10]);
            foo1(-1);
        } catch (NullPointerException e) {

        } catch (RuntimeException e) {
            System.out.println("za duzy index");
        } catch (IOException e) {

        } finally {

        }
        System.out.println("dalej dziala");
    }

    static void foo1(int arg) throws IOException {
        if (arg < 1) {
            throw new IllegalArgumentException("value should  be gt than 0");
        }
    }
}
