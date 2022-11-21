import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(4000, 1000, "Якименко Олеся");
        System.out.println("Проверка накопительного счёта: ");
        System.out.println("Баланс: " + savingsAccount.getBalance() + " рублей");
        System.out.println("Оплатить 3000 рублей: " + savingsAccount.pay(3000));
        System.out.println("Пополнить баланс на 3000 рублей: " + savingsAccount.add(3000));
        System.out.println();

        CheckingAccount checkingAccount = new CheckingAccount(4000, "Якименко Алексей");
        System.out.println("Проверка расчетного счёта: ");
        System.out.println("Баланс: " + checkingAccount.getBalance() + " рублей");
        System.out.println("Оплатить 4000 рублей: " + checkingAccount.pay(4000));
        System.out.println("Пополнить баланс на 3000 рублей: " + checkingAccount.add(3000));
        System.out.println();

        CreditAccount creditAccount = new CreditAccount("Якименко Милина");
        System.out.println("Проверка кредитного счёта: ");
        System.out.println("Баланс: " + checkingAccount.getBalance() + " рублей");
        System.out.println("Оплатить 4000 рублей: " + checkingAccount.pay(4000));
        System.out.println("Пополнить баланс на 3000 рублей: " + checkingAccount.add(3000));
        System.out.println();

    }
}


