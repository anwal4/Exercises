package EXERCISES.MY_EXERCISE.Volume;

public class Rectangle implements AreaOfBase {
    String nameOfBase = "Rectangle";
    double Bok_A, Bok_B, heightOfBlock;
    Rectangle(double Bok_A, double Bok_B, double heightOfBlock){
        this.Bok_A = Bok_A;
        this.Bok_B = Bok_B;
        this.heightOfBlock = heightOfBlock;
    }
    @Override
    public double areaOfBase(){
        return  Bok_A * Bok_B;
    }

    @Override
    public double Volume() {
        return areaOfBase() * heightOfBlock;
    }
}
