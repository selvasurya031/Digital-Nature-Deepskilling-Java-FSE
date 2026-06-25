package code;

public class Main {

    public static void main(String[] args) {

        InventoryManager manager =
                new InventoryManager();

        manager.addProduct(
                new Product(101,
                            "Laptop",
                            50,
                            60000));

        manager.addProduct(
                new Product(102,
                            "Phone",
                            80,
                            25000));

        manager.displayProducts();

        manager.updateProduct(101, 100);

        manager.deleteProduct(102);

        System.out.println();

        manager.displayProducts();
    }
}
