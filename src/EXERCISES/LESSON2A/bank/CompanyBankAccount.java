package EXERCISES.LESSON2A.bank;

public class CompanyBankAccount extends BankAccount {
    long companyId;

    protected CompanyBankAccount(long companyId, int maxDebit) {
        super(maxDebit);
        this.companyId = companyId;
    }

    @Override
    int tranferCost(BankAccount other) {
        if (other instanceof CompanyBankAccount) {
            CompanyBankAccount p = (CompanyBankAccount) other;
            if (p.companyId == this.companyId) {
                return 0;
            }

        }
        return 2;
    }
}
