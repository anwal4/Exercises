package EXERCISES.LESSON2;

public class Ex22 {
    public static void main(String[] args) {
//        MobilePhone phone = new MobilePhone();
//        phone.call("1234");
//
//        Phone p1 = new Phone();
//        p1.call("4321");
        Phone p2 = new MobilePhone();
        p2.call("6543");

        // wywolac metode sms, bez tworzenia nowego obiektu
        MobilePhone mp = (MobilePhone) p2;
        mp.sms("123", "123");

    }
}

class Phone {
    public void call(String number) {
        System.out.println("Phone call: " + number);
    }
}

class MobilePhone extends Phone {

    @Override
    public void call(String number) {
        System.out.println("MobilePhone");
        super.call(number);
    }

    public void sms(String number, String text) {
        System.out.println("Sms to" + number +" : " + text);
    }
}
