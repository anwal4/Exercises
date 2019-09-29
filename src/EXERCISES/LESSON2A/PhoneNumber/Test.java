package EXERCISES.LESSON2A.PhoneNumber;

public class Test {
    public static void main(String[] args) {
        PhoneNumber p1 = new MoblilePhoneNumber();
        PhoneNumber p2 = new MoblilePhoneNumber();
        PhoneNumber p3 = new LandingPhoneNumber();
        PhoneNumber p4 = new LandingPhoneNumber();
        p1.callTo(p2, 4);
        p2.callTo(p1, 6);
        p3.callTo(p2, 8);
        p1.callTo(p1, 4);
        p4.callTo(p2, 8);
        System.out.println();
    }
}
