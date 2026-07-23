package Week__1.Week_1.AdapterPatternExample.src.com.Adapter;

public class PaytmAdapter implements PaymentProcessor {
	public PaytmAdapter(Paytm paytm) {
		this.paytm = paytm;
	}
	Paytm paytm;
	@Override
	public void processPayment() {
		paytm.paytmPay();
	}

}
