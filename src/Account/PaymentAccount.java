package Account;

import java.text.DecimalFormat;

public class PaymentAccount {

    protected double allCount;
    DecimalFormat formatter = new DecimalFormat("#0.0 руб");

    public PaymentAccount() {
    }

    public void getAllCount() {
        System.out.println("Общая сумма на счету: " + formatter.format(allCount));
    }

    public void giveMoney(double money) {
        allCount = allCount + money;
        System.out.println("Вы пополнили счет на сумму: " + formatter.format(money));
    }
    public void takeMoney(double money){
        if (allCount - money >= 0){
            allCount = allCount - money;
            System.out.println("Вы вывели со счета: " + formatter.format(money));
        }else{
            System.out.println("Недостаточно средств для снятия");
        }
    }
}