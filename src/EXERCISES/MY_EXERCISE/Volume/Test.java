package EXERCISES.MY_EXERCISE.Volume;

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, 5);
        System.out.println(r1.nameOfBase + " area of base is " + r1.areaOfBase() + " with edges " + r1.Bok_A + " and " +
                r1.Bok_B + ".");
        System.out.println("Volume of block with " + r1.nameOfBase + "'s area of base is " + r1.Volume() + " with height "
                + r1.heightOfBlock + ".\n");


        Square s1 = new Square(10, 5);
        System.out.println(s1.nameOfBase + " area of base is " + s1.areaOfBase() + " with edges " + s1.Bok_A + ".");
        System.out.println("Volume of block with " + s1.nameOfBase + "'s area of base is " + s1.Volume() + " with height "
                + s1.heightOfBlock + ".\n");
    }
}
