package EXERCISES.LESSON2A.PhoneNumber;

public class LandingPhoneNumber implements PhoneNumber {
    private int bill = 0;

    @Override
    public int currentMonthBill() {
        return bill;
    }

    @Override
    public void callTo(PhoneNumber number, int callTime) {
        if (number instanceof LandingPhoneNumber){
            bill+=callTime*1;
            }
        else {
            bill+=callTime*2;
        }


}
}
