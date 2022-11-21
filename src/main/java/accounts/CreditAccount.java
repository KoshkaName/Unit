package accounts;


public class CreditAccount extends Account {

    public CreditAccount(String name) {
        super(0, name);
    }

    @Override
    public boolean add(long amount) {
        if ((this.getBalance() + amount) <= 0) {
            return super.add(amount);
        } else {
            return false;
        }
    }
}


