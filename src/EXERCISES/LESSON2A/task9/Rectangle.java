package EXERCISES.LESSON2A.task9;

public class Rectangle extends Shape{

    private final int x, y;
    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    double area() {
        return x*y;
    }

    @Override
    double peremeter() {
        return 2*x + 2*y;
    }
}

