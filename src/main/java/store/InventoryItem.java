package store;

public class InventoryItem {
    private final Product product;
    private int quantity;

    public InventoryItem(Product product, int quantity) {
        if (product == null) throw new IllegalArgumentException("product required");
        if (quantity < 0) throw new IllegalArgumentException("quantity >= 0");
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("quantity >= 0");
        this.quantity = quantity;
    }
}
