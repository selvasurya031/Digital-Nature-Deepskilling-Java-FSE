package code;

import java.util.Arrays;

public class Search {
	public static Product linearSearch(Product[] product,int id) {
		for(Product p: product) {
			if(id==p.prodId) {
				return p;
			}
		}
		return null;
	}
	public static Product binarySearch(Product[] product,int id) {
		int plength = product.length;
		int mid = plength /2;
		
		Arrays.sort(product,
		        (p1, p2) -> Integer.compare(p1.prodId, p2.prodId));

		while(mid>0 && mid<plength) {
			if(product[mid].prodId==id) {
				return product[mid];
			}
			else if(product[mid].prodId<id) {
				mid = (mid+1+plength) /2;
			}
			else {
				mid = mid-1/2;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Product[] product = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
		};
		int id = 105;
		System.out.println("Linear Search for id :"+ id );
		System.out.println(linearSearch(product ,id));
		
		System.out.println();
		
		System.out.println("Binary Search for id :"+id);
		System.out.println((binarySearch(product,id)));
		System.out.println();
		
		id = 200;
		
		System.out.println("Linear Search for id:" + id);
		System.out.println(linearSearch(product ,id));
		
		System.out.println();
		
		System.out.println("Binary Search for id:" + id);
		System.out.println((binarySearch(product,id)));
	}

}
