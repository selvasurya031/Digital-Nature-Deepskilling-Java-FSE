package code;

public class Display {
	public void display(Order[] orders) {
		for(int i =0;i<orders.length;i++) {
			System.out.print(orders[i] + "\n");
		}
		System.out.println();
	}
}
