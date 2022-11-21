import accounts.Account;
import accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountTest {

    public Account account;

    @BeforeEach
     public void setUp() {
        account = new SavingsAccount(4000, 1000, "Якименко Олеся");
    }

    @Test
    @DisplayName("Оплатить 3000")
    public void savingsPayOff() {
        Assertions.assertTrue(account.pay(3000));
    }
    @Test
    @DisplayName("Пополнение баланса на 3000")
    public void savingsAdd() {
        Assertions.assertTrue(account.add(3000));
    }

    @Test
    @DisplayName("Оплатить 5000")
    public void savingsPayToo() {
        Assertions.assertFalse(account.pay(5000));
    }



}
