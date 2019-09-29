package EXERCISES.LESSON2;

public class Ex26 {
}


abstract class House {
    abstract int cubicCapacity();
}

class CottageHouse extends House {

    final int a, l, h;

    CottageHouse(int a, int l, int h) {
        this.a = a;
        this.l = l;
        this.h = h;
    }

    @Override
    int cubicCapacity() {
        return a*a*l + a*a*h*1/2;
    }
}

class FlatRoofHouse extends House {

    final int a;
    final int l;

    FlatRoofHouse(int a, int l) {
        this.a = a;
        this.l = l;
    }

    @Override
    int cubicCapacity() {
        return a*a* l;
    }
}