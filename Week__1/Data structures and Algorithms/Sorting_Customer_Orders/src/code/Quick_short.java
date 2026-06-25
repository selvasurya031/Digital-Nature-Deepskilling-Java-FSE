package code;

public class Quick_short { 

	public void short_arr(Order[] orders, int low , int high) {
		
		if(low < high) {
			int pivot = partition(orders,low,high);
			short_arr(orders,low,pivot);
			short_arr(orders,pivot+1,high);
		}

	}
	public int partition(Order[] orders, int low, int high) {
		int i = low;
		int pivot = orders[high-1].totalPrice;
		for(int j =low;j<high;j++) {
			if(orders[j].totalPrice<pivot) {
				Order temp = orders[i];
				orders[i]=orders[j];
				orders[j]=temp;
				i++;
				
			}
		}
		 Order temp = orders[i];
		orders[i] = orders[high-1];
		orders[high-1]= temp;
		
		return i;
	}
	

}
