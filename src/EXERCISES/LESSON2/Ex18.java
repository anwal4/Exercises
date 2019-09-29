package EXERCISES.LESSON2;

public class Ex18 {

    public static void main(String[] args) {

    }
}

class Rectangle {

    final int a;
    final int b;

    Rectangle(int s, int y) {
        this.a = s;
        this.b = y;
    }

    Rectangle(int c) {
        this(c, c);
    }
}

