package EXERCISES.MY_EXERCISE.Volume;

public class Circle implements AreaOfBase{
    String nameOfBase = "Circle";
    double Radius, heightOfBlock;
    Circle(double Radius, double heightOfBlock){
        this.Radius = Radius;
        this.heightOfBlock = heightOfBlock;
    }

    @Override
    public double areaOfBase() {
        return Math.PI * Radius;
    }

    @Override
    public double Volume() {
        return areaOfBase() * heightOfBlock;
    }
}
