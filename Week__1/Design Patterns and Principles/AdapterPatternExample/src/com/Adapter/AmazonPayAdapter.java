package Week__1.Week_1.AdapterPatternExample.src.com.Adapter;

public class AmazonPayAdapter implements PaymentProcessor {
	public AmazonPayAdapter(AmazonPay amazonpay) {
		this.amazonpay = amazonpay;
	}
	AmazonPay amazonpay;
	@Override
	public void processPayment() {
		// TODO Auto-generated method 
		amazonpay.amazonPay();
	}

}
