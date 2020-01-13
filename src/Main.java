import Account.CreditAccount;
import Account.DepositAccount;
import Account.PaymentAccount;

public class Main
{
    public static void main(String[] args) {

        PaymentAccount first = new PaymentAccount();
        CreditAccount two = new CreditAccount();
        DepositAccount other = new DepositAccount();


        first.getAllCount();
        first.giveMoney(100);
        first.getAllCount();
        first.takeMoney(50);
        first.getAllCount();
        first.takeMoney(100);
        System.out.println("\n");

        two.giveMoney(1000);
        two.getAllCount();
        two.takeMoney(500);
        two.getAllCount();
        System.out.println("\n");

        other.giveMoney(1000);
        other.getAllCount();
        other.takeMoney(100);

    }
}
