package code;

public class Bubble_sort{

	public void short_arr(Order[] orders) {
	int swap =0;
		for(int i =0;i<orders.length;i++) {
			for(int j =i+1;j<orders.length;j++) {
				if(orders[i].totalPrice > orders[j].totalPrice) {
					Order temp = orders[i];
					orders[i] = orders[j];
					orders[j] = temp;
					swap++;
				}
			}
		}
	}

}
