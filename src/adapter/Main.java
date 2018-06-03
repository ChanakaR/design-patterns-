package adapter;

/**
 * Created by root on 03/06/18.
 */
public class Main {
    public static void main(String[] args) {
        MoneyBooker moneyBooker = new MoneyBooker();
        MoneyBookerPaymentAdapter moneyBookerPaymentAdapter = new MoneyBookerPaymentAdapter(moneyBooker);
        moneyBookerPaymentAdapter.doPayment(1234);

        PayPal payPal = new PayPal();
        PayPalPaymentAdapter payPalPaymentAdapter = new PayPalPaymentAdapter(payPal);
        payPalPaymentAdapter.doPayment(3456);
    }
}
