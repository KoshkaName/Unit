import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
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

    @BeforeEach
    public void setUp1() {
        account = new CreditAccount("Якименко Милина");
    }

    @Test
    @DisplayName("Оплатить 3000")
    public void creditPayOff() {
        Assertions.assertTrue(account.pay(3000));
    }

    @BeforeEach
    public void setUp3() {
        account = new CheckingAccount(4000, "Якименко Алексей");
    }

    @Test
    @DisplayName("Пополнение баланса на 3000")
    public void checkingAdd() {
        Assertions.assertTrue(account.add(3000));
    }


}
