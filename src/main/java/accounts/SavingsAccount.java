package accounts;


public class SavingsAccount extends Account {
    public long minBalance;

    public SavingsAccount(long balance, long minBalance, String name) {
        super(balance, name);
        this.minBalance = minBalance;
    }

    public boolean pay(long amount) {
        if ((this.getBalance() - amount) >= minBalance) {
            return super.pay(amount);
        } else {
            return false;
        }
    }


}


