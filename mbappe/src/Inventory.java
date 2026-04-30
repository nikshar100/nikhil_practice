import java.util.Arrays;
public class Inventory {
    public int numProducts = 0;
    public Product[] productList;


    public void addStock(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity cannot be less than or equal 0.");
        }
        for (Product p : productList) {
            if (p != null) {
                p.toString();
            }
        }


    }

    public Inventory(int capacity) {
        productList = new Product(capacity);
    }

}

