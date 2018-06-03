package adapter;

/**
 * Created by root on 03/06/18.
 */
public class MoneyBookerPaymentAdapter implements PaymentAdapter {

    private MoneyBooker moneyBooker;

    MoneyBookerPaymentAdapter(MoneyBooker moneyBooker){
        this.moneyBooker = moneyBooker;
    }

    @Override
    public void doPayment(int amount) {
        this.moneyBooker.pay(amount);
    }
}
