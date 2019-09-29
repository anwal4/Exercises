package EXERCISES.LESSON2A.dom;

public class FlatRoofHouse extends House {
    final int a;

    public FlatRoofHouse(int a) {
        this.a = a;
    }

    @Override
    int cubicCapacity() {
        return 0;

    }
}
