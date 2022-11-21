package accounts;


public class CheckingAccount extends Account {
    public final long MIN = 0;

    public CheckingAccount(long balance, String name) {
        super(balance, name);
    }

    @Override
    public boolean pay(long amount) {
        if ((this.getBalance() - amount) >= MIN) {
            return super.pay(amount);
        } else {
            return false;
        }
    }


}


