package EXERCISES.LESSON2;

public class Ex27 {

}


enum Planets {
    Mercury(10), Earth(1, 3) {
        @Override
        boolean canLive() {
            return super.canLive();
        }
    };
    private int size;
    private int weight;

    boolean canLive() {
        return false;
    }

    Planets(int s) {
        this(s, 0);
    }

    Planets(int s, int w) {
        size = s;
        weight = w;
    }
}