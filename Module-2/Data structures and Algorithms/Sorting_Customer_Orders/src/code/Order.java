package code;

public class Order {
	int orderId;
	String customerName;
	int totalPrice;	
	
	public Order(int orderId, String customerName, int totalPrice) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", totalPrice=" + totalPrice + "]";
	}
	
	

}
