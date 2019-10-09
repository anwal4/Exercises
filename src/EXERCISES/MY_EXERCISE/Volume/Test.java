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

        Parallelogram p1 = new Parallelogram(10, 20, 5);
        System.out.println(p1.nameOfBase + " area of base is " + p1.areaOfBase() + " with edges " + p1.Bok_A + " and " +
                p1.Bok_B + ".");
        System.out.println("Volume of block with " + p1.nameOfBase + "'s area of base is " + p1.Volume() + " with height "
                + p1.heightOfBlock + ".\n");

        Diamond d1 = new Diamond(10, 5);
        System.out.println(d1.nameOfBase + " area of base is " + d1.areaOfBase() + " with edges " + d1.Bok_A + ".");
        System.out.println("Volume of block with " + d1.nameOfBase + "'s area of base is " + d1.Volume() + " with height "
                + d1.heightOfBlock + ".\n");

        Circle c1 = new Circle(10, 5);
        System.out.println(c1.nameOfBase + " area of base is " + c1.areaOfBase() + " with radius " + c1.Radius + ".");
        System.out.println("Volume of block with " + c1.nameOfBase + "'s area of base is " + c1.Volume() + " with height "
                + c1.heightOfBlock + ".\n");
    }
}
