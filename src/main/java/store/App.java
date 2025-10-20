package store;

import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        IStore store = new Inventory();

        store.addProduct(new Product("P001", "Skirt", Category.CLOTHING, 19.99), 10);
        store.addProduct(new Product("P002", "Sweater", Category.CLOTHING, 29.99), 5);
        store.addProduct(new Product("P003", "Notebook A5", Category.STATIONERY, 3.50), 25);

        System.out.println("\n-- Current Stock --");
        store.stockStatus();

        System.out.println("\n-- Update P003 to 40 --");
        store.updateStock("P003", 40);

        System.out.println("\n-- Find P002 --");
        System.out.println(store.findProduct("P002"));

        // Persist
        FileStorage storage = new FileStorage(Path.of("inventory.csv"));
        storage.save((Inventory) store);
        System.out.println("\nSaved to inventory.csv");

        // Load to a new store instance to demonstrate persistence
        Inventory loaded = new Inventory();
        storage.load(loaded);
        System.out.println("\n-- Loaded Stock --");
        loaded.stockStatus();
    }
}
