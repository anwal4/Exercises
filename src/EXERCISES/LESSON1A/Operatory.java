package EXERCISES.LESSON1A;

public class Operatory {
    public static void main(String[] args) {
        double zet = 2.0;
        double xet = zet + 1;
        System.out.println("Z jest równe " + zet + ", " + "zmienna x jest równa " + xet + ".");
        int i = 0b01001;//Wartość binarna
        System.out.println(i);
        System.out.println(~i);
        //Zamiania typu liczby
        int iii = 129;
        double zzz = (double) iii;
        System.out.println("Pierwsza liczba wynosi " + iii + ", druga liczba wynosi " + zzz);

        //short s1 = 10;
        //short s2 = 20;
        //short s3 = s1 + s2; //Kompilator wykryje błąd, poniewaź jest przekroczony zakres typu

        int a = 10;
        System.out.println(a % 3);//Rezultatem jes reszta z odejmowania

        int e = 3;
        int r = 4;
        int t = e * e + r * r;
        System.out.println(e * e + r * r);
        System.out.println(Math.sqrt(t));//oblicza pierwiastek

    }
}
