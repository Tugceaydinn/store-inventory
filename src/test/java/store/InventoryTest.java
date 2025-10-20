package store;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    @Test
    public void addAndFindProduct() {
        Inventory inv = new Inventory();
        Product p = new Product("X1", "Test", Category.OTHER, 1.0);
        inv.addProduct(p, 3);
        assertEquals(p, inv.findProduct("X1"));
    }

    @Test
    public void updateStock() {
        Inventory inv = new Inventory();
        Product p = new Product("X2", "Test2", Category.OTHER, 2.0);
        inv.addProduct(p, 5);
        inv.updateStock("X2", 10);
        assertEquals(10, inv.getItems().stream().filter(i -> i.getProduct().getId().equals("X2")).findFirst().get().getQuantity());
    }
}
