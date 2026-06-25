package Week__1.Week_1.AdapterPatternExample.src.com.Adapter;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gpay gpay = new Gpay();
		PaymentProcessor gpayadapter = new GpayAdapter(gpay);
		gpayadapter.processPayment();
		Paytm paytm = new Paytm();
		PaymentProcessor paytmAdapter = new PaytmAdapter(paytm);
		paytmAdapter.processPayment();
		AmazonPay amazonpay = new AmazonPay();
		PaymentProcessor amazonpayAdapter = new AmazonPayAdapter(amazonpay);
		amazonpayAdapter.processPayment();
				

	}

}
