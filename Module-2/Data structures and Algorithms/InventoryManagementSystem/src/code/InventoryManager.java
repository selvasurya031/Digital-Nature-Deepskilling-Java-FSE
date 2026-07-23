package code;
import java.util.HashMap;

public class InventoryManager {
	HashMap<Integer,Product> inventory = new HashMap<>();
	
	public void addProduct(Product product) {
		inventory.put(product.productId,product);
		System.out.println( " Product Added");
		
	}
	public void updateProduct(int productId,int newQuantity) {
		Product product = inventory.get(productId);
		if(product != null) {
			product.quantity = newQuantity;
			System.out.println("Product Updated :"+ product);
		}
	}
	public void deleteProduct(int productId) {
		inventory.remove(productId);
		System.out.println("Deleted");
	}
	public void displayProducts() {
		System.out.println();
		for(Product p :inventory.values()) {
			System.out.println(p);
		}
		System.out.println();
	}
}
