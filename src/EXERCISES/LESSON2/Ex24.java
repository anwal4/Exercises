package EXERCISES.LESSON2;

public class Ex24 {
    public static void main(String[] args) {
        Uczen u = new Uczen("jan", "dwa", 2);
    }
}

class Osoba {

    Osoba(String imie, String nazwisko) {

    }

}

class Uczen extends Osoba {
    Uczen(String imie, String nazwisko, int klasa) {
        super(imie, nazwisko);
    }
}