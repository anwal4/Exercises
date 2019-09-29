package EXERCISES.LESSON2A.bank;

public class PrivetBankAccount extends BankAccount {
    private long ownerId;

    protected PrivetBankAccount(long ownerId, int maxDebit) {
        super(maxDebit);
        this.ownerId = ownerId;
    }

    @Override
    int tranferCost(BankAccount other) {
        if (other instanceof PrivetBankAccount) {
            PrivetBankAccount p = (PrivetBankAccount) other;
            if (p.ownerId == this.ownerId) {
                return 0;
            }

        }
        return 1;
    }
}

