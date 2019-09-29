package EXERCISES.LESSON2A.bank;

abstract class BankAccount {
    private int saldo = 0, maxDebit;

    protected BankAccount(int maxDebit) {
        this.maxDebit = maxDebit;
    }

    void withDraw(int m){
        saldo-=m;
    }

    void deposit(int m){
        saldo+=m;
    }

    private void receive(int m){
        saldo+=m;
    }

    abstract int tranferCost(BankAccount other);

    void transferTo(BankAccount other, int m){
        other.receive(m);
        saldo-=m;
        saldo-=tranferCost(other);
    }

}
