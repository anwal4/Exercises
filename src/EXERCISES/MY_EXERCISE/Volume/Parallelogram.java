package EXERCISES.MY_EXERCISE.Volume;

public class Parallelogram extends Rectangle implements AreaOfBase {
    String nameOfBase = "Parallelogram";
    Parallelogram(double Bok_A, double Bok_B, double heightOfBlock) {
        super(Bok_A, Bok_B, heightOfBlock);
    }
    @Override
    public  double areaOfBase(){
        return  Bok_A * Bok_B;
    }

    @Override
    public double Volume() {
        return areaOfBase() * heightOfBlock;
    }
}
