package Week__1.Week_1.AdapterPatternExample.src.com.Adapter;

public class GpayAdapter implements PaymentProcessor {
	private Gpay gpay;
	GpayAdapter(Gpay gpay){
		this.gpay=gpay;
	}
	@Override
	public void processPayment() {
		gpay.gpayPay();		
	}

}
