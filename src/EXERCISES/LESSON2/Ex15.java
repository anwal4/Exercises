package EXERCISES.LESSON2;

public class Ex15 {

    public static void main(String[] args) {

        Bottle b = new Bottle();
        b.fill(10);
        System.out.println();
        b.fill(12);
        System.out.println(b.currentLevel);
        b.drink(12);
        b.drink(11);
        System.out.println(b.currentLevel);
        b.makeEmpty();
        System.out.println(b.currentLevel);
        System.out.println(b.isEmpty());
    }
}

class Bottle {
    int capacity;
    int currentLevel;

    boolean isEmpty() {
        return currentLevel == 0;
    }

    void makeEmpty() {
        currentLevel = 0;
    }

    void drink(int volume) {
        currentLevel -= volume;
    }

    void fill(int volume) {
        currentLevel += volume;
    }


}
