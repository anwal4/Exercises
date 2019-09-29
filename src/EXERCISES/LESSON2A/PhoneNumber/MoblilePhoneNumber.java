package EXERCISES.LESSON2A.PhoneNumber;

public class MoblilePhoneNumber implements PhoneNumber{
    private int bill1 = 0;

    @Override
    public int currentMonthBill() {

        return bill1;
    }

    @Override
    public void callTo(PhoneNumber number, int callTime) {
        if (number instanceof MoblilePhoneNumber){
            bill1+=callTime/2;
        }
        else {
            bill1+=callTime*2;
        }
    }
}
