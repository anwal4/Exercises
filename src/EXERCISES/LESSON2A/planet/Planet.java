package EXERCISES.LESSON2A.planet;

public enum Planet {

    Saturn(10, 1), Jowisz(11,2 ), Mars(12, 3), Uran(13,4 ),
    Wenus(14, 5), Ziemia(15, 6){ };
    private int size;
    private int weight;
    private Planet (int s){
        this(s, 0);
    }
    private Planet(int s, int w){
        size = s;
        weight = w;
    }
}
