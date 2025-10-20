package store;

public interface IStore {
    void stockStatus();
    void addProduct(Product product, int quantity);
    void removeProduct(String productId);
    Product findProduct(String productId);
    void updateStock(String productId, int newQuantity);
}
