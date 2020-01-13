package Account;

import java.util.Calendar;
import java.util.Date;

public class DepositAccount extends PaymentAccount {

    Calendar calendar = Calendar.getInstance();
    Date afterMonth;
    Date today;

    public DepositAccount() {
    }

    public void giveMoney(double money) {
        allCount = allCount + money;
        System.out.println("Вы пополнили счет на сумму: " + formatter.format(money));
        setCalendar();
    }
    public void takeMoney(int moeny) {
        if (afterMonth.before(today)){
            allCount = allCount - moeny;
            System.out.println("Вы вывели со счета - " + formatter.format(moeny));
        }else{
            System.out.println("Снятие со счета доступно через месяц после последнего вклада");
        }
    }
    public void setCalendar(){
        today = calendar.getTime();
        calendar.add(Calendar.MONTH,1);
        afterMonth = calendar.getTime();
    }
}