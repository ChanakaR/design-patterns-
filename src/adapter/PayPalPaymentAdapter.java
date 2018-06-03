package adapter;

/**
 * Created by root on 03/06/18.
 */
public class PayPalPaymentAdapter implements PaymentAdapter {

    private PayPal payPal;

    PayPalPaymentAdapter(PayPal payPal){
        this.payPal = payPal;
    }

    @Override
    public void doPayment(int amount) {
        this.payPal.payAmount(amount);
    }
}
