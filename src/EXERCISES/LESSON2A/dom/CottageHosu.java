package EXERCISES.LESSON2A.dom;

public class CottageHosu extends House {
    final int a, l, h;
    CottageHosu(int a, int l, int h){
        this.a = a;
        this.l = l;
        this.h = h;
    }

    @Override
    int cubicCapacity() {
        return a*a*l + a*a*h*1/2;

    }
}
