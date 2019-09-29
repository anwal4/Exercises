package EXERCISES.LESSON2;

public class Ex25b {
    public static void main(String[] args) {

        ProPlayer p = new ProPlayer();

    }
}

interface Footballer {
    default void kickBall() {

    }
}

class AmatourPlayer implements Footballer {

}

class ProPlayer implements Footballer {
    public void kickBall() {

    }
}