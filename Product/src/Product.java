public class Product {
    private String productName;
    private double price;
    private final int sku;

    public Product(String productName, double price, int identifier) {
        this.productName = productName;
        if (price <= 0) {
            throw new IllegalArgumentException("Cannot set price less than or equal to 0.");
        }
        this.price = price;
        this.sku = identifier;


    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Cannot enter a price less than or equal to 0");
        }
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getSku() {
        return sku;
    }

    @Override
    public String toString() {
        return String.format("%s $%.2f %d", productName, price, sku);
    }
}

