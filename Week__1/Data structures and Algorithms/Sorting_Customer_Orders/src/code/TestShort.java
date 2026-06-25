package code;

public class TestShort {
	public static void main(String[] args) {

	Order[] arr1 = {
            new Order(101, "Sachin", 2500),
            new Order(102, "Rahul", 1200),
            new Order(103, "Kumar", 3000),
            new Order(104, "Arun", 1800)
        };
	
	
	Order[] arr2 = {
            new Order(101, "Sachin", 2500),
            new Order(102, "Rahul", 1200),
            new Order(103, "Kumar", 3000),
            new Order(104, "Arun", 1800)
        };
	Display D = new Display();
	Quick_short q = new Quick_short();
	

	
	Bubble_sort  bubblesort = new Bubble_sort();
	
	q.short_arr(arr1, 0, arr1.length);
	
	bubblesort.short_arr(arr2);
	
	System.out.println("\nQuick sort");
	
	D.display(arr1);
	
	System.out.println("\nBubble sort");	
	
	D.display(arr2);
	

}
}
