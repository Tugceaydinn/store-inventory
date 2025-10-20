package store;

import java.util.*;

public class Inventory implements IStore {
    private final Map<String, InventoryItem> items = new LinkedHashMap<>();

    @Override
    public void stockStatus() {
        if (items.isEmpty()) {
            System.out.println("(empty)");
            return;
        }
        items.values().forEach(it -> System.out.println(
                it.getProduct().getId() + " | " + it.getProduct().getName()
                        + " | " + it.getQuantity() + " pcs | price=" + it.getProduct().getPrice()
        ));
    }

    @Override
    public void addProduct(Product product, int quantity) {
        InventoryItem existing = items.get(product.getId());
        if (existing == null) {
            items.put(product.getId(), new InventoryItem(product, quantity));
        } else {
            existing.setQuantity(existing.getQuantity() + quantity);
        }
    }

    @Override
    public void removeProduct(String productId) {
        items.remove(productId);
    }

    @Override
    public Product findProduct(String productId) {
        InventoryItem it = items.get(productId);
        return it == null ? null : it.getProduct();
    }

    @Override
    public void updateStock(String productId, int newQuantity) {
        InventoryItem it = items.get(productId);
        if (it != null) it.setQuantity(newQuantity);
        else throw new IllegalArgumentException("product not found: " + productId);
    }

    // helper to get items for persistence
    public Collection<InventoryItem> getItems() {
        return items.values();
    }

    // helper to clear and load
    public void clear() {
        items.clear();
    }
}
