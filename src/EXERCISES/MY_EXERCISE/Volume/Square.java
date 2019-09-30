package EXERCISES.MY_EXERCISE.Volume;

public class Square extends Rectangle implements AreaOfBase {
    String nameOfBase = "Square";

    Square(double Bok_A, double heightOfBlock) {
        super(Bok_A, Bok_A, heightOfBlock);
    }

    @Override
    public double areaOfBase() {
        return Bok_A * Bok_A;
    }

    @Override
    public double Volume() {
        return areaOfBase() * heightOfBlock;
    }
}
