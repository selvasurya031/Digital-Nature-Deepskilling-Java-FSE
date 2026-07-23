package code;

public class Product {
	int prodId;
	String prodName;
	String category;
	
	public Product(int prodId, String prodName, String category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", category=" + category + "]";
	}

	

}
