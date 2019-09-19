package EXERCISES.HOMEWORK;

public class Ex6_Prime_Number {
    /*
    Rozłóż liczbę na czynniki pierwsze.
   16
   16:2=8 pierwszy czynnik 2, dalej dzieli przez 2
   8:2=4 kolejny czynnik 2, dalej dzieli przez 2
   4:2=2 kolejny czynnik 2, dalej dzili przez 2
   2:2=1 kolejny czynnik 2, koniec

   9
   9:2=4,5 brak pierwszego czynnika, dzieli przez 3
   9:3=3  pierwszy czynnik 3, dalej dzieli przez 3
   3:3=1 kolejny czynnik 3, koniec

   40
   40:2=20 pierwszy czynnik 2, dalej dzieli prze 2
   20:2=10 kolejny czynnik 2, dalej dzieli przez 2
   10:2=5 kolejny czynnik, dalej dzieli przez 2
   5:2=4,5 brak, dzieli przez 3
   5:3=1,66 brak, dzieli przez 4
   5:4=1,25 brak, dzieli przez 5
   5:5=1 kolejny czynnik 5, koniec

   5
   5:2=4,5 brak, dzieli przez 3
   5:3=1,66 brak, dzieli przez 4
   5:4=1,25 brak, dzieli przez 5
   5:5=1 kolejny czynnik 5, koniec 5 jest liczbą pierwszą
   */

    public static void main(String[] args) {
        int liczba = 100;//liczba rozkładana na czynniki pierwsze
        int zmienna = liczba, a = 2;
        while (zmienna >= a) {
            if (zmienna % a == 0) {
                zmienna = zmienna / a;
                System.out.print(a + ", ");
            } else {
                a++;
                if (zmienna == liczba) {
                    System.out.print(liczba + " jest liczbą pierwszą");
                    break;
                }
            }


        }
    }
}
