package EXERCISES.LESSON2;

public class Ex23 {
    public static void main(String[] args) {

        Plane p = new Plane();
        System.out.println(p.getPassengerNumber());
    }
}

class Plane {

    private int passengerNumber = 0;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    void onboardPasenger() {
        passengerNumber++;
    }

    void onboardPasenger(int n) {
        passengerNumber+=n;
    }
}
