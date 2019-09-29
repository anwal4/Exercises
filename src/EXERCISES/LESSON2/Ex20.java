package EXERCISES.LESSON2;

import java.util.HashSet;
import java.util.Set;

public class Ex20 {
    public static void main(String[] args) {
        BottleV3 b = new BottleV3();
        System.out.println(b.toString());
        System.out.println(b);

        System.out.println(b.equals("napis"));
        System.out.println(b.equals(b));

        /* TODO DODAJ
        BottleV3 b1 = new BottleV3();
        b1.fill(5);
        Set<BottleV3> set = new HashSet<>();
        set.add(b1);
        set.add(b1);
        b1.fill(1);
        set.add(b1);
        System.out.println(set);
        */
    }
}

class A {
    void b() {

    }
    int b(int a) {
        return 1;
    }
    Long b(Integer a) {
        return 1L;
    }
}

class BottleV3 extends Object {

    // TODO dodaj do slajdow instanceof
    @Override
    public boolean equals(Object obj) {

//        if (!(obj instanceof BottleV3)) {
//            return false;
//        }
//        BottleV3 b = (BottleV3) obj;
//        return this.capacity == b.capacity &&
//                this.currentLevel == b.currentLevel;

        if (obj instanceof BottleV3) {
            BottleV3 b = (BottleV3) obj;
            return this.capacity == b.capacity &&
                    this.currentLevel == b.currentLevel;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.capacity;
    }

    public String toString() {
        return "Moje capacity:" + this.capacity + ", level: " + this.currentLevel;
    }

    BottleV3() {
        this(10);
    }

    BottleV3(int capacity) {
        this.capacity = capacity;
    }

    BottleV3(int initCapacity, int initLevel) {
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
