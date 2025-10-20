package store;

import java.io.*;
import java.nio.file.Path;
import java.util.StringJoiner;

public class FileStorage {
    private final Path path;

    public FileStorage(Path path) {
        this.path = path;
    }

    public void save(Inventory inventory) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path.toFile(), false))) {
            for (InventoryItem it : inventory.getItems()) {
                StringJoiner sj = new StringJoiner(",");
                sj.add(it.getProduct().getId())
                        .add(it.getProduct().getName().replace(",", ""))
                        .add(it.getProduct().getCategory().name())
                        .add(String.valueOf(it.getProduct().getPrice()))
                        .add(String.valueOf(it.getQuantity()));
                pw.println(sj.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(Inventory inventory) {
        try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
            inventory.clear();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length < 5) continue;
                Product p = new Product(parts[0], parts[1], Category.valueOf(parts[2]), Double.parseDouble(parts[3]));
                int q = Integer.parseInt(parts[4]);
                inventory.addProduct(p, q);
            }
        } catch (FileNotFoundException e) {
            // no file yet - fine
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
