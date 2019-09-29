package EXERCISES.LESSON2;

public class Ex17 {
    public static void main(String[] args) {

    }
}

class BottleV2 {

    BottleV2() {
        this(10);
    }

    BottleV2(int capacity) {
        this.capacity = capacity;
    }

    BottleV2(int initCapacity, int initLevel) {
        this(initCapacity);
        currentLevel = initLevel;
    }

    final int capacity;
    int currentLevel;

    boolean isEmpty() {
        return this.currentLevel == 0;
    }

    void makeEmpty() {
        this.currentLevel = 0;
    }

    void drink(int volume) {
        this.currentLevel -= volume;
    }

    void fill(int volume) {
        this.currentLevel += volume;
    }


}
