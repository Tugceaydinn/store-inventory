# 🏪 Store Inventory (Java)

[![Build](https://github.com/Tugceaydinn/store-inventory/actions/workflows/ci.yml/badge.svg)](https://github.com/Tugceaydinn/store-inventory/actions/workflows/ci.yml)  
![Java](https://img.shields.io/badge/Java-17-informational?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-ready-informational?logo=apache-maven)
![JUnit](https://img.shields.io/badge/Tests-JUnit5-green?logo=java)
![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)

**Store Inventory** is a simple inventory management system built with **Java** and **Maven**.  
It allows you to **add, update, remove, and list products**, while keeping track of stock quantities and prices.  
The inventory can be saved to and loaded from a **CSV file**, so your data is persistent between runs.

This project demonstrates:
- ✅ Object-oriented design (OOP)
- 🧩 Interface-based architecture
- 💾 File I/O with CSV
- 🧪 Unit testing with JUnit 5

---

## ✨ Features
- ➕ Add, ✏️ Update, ❌ Remove products
- 🧾 In-memory stock management with `InventoryItem`
- 💾 Save and load inventory via `FileStorage`
- 🧪 Unit tests with **JUnit 5**
- 🖥️ Simple console demo (`App.java`)

---

## 🧰 Tech Stack
- ☕ Java 17
- 🧭 Maven
- 🧪 JUnit 5
- 📄 CSV file storage

---

## 📁 Project Structure

```
store-inventory/
├─ pom.xml
├─ README.md
├─ LICENSE
├─ .github/workflows/ci.yml
└─ src
├─ main/java/store
│ ├─ App.java
│ ├─ IStore.java
│ ├─ Category.java
│ ├─ Product.java
│ ├─ InventoryItem.java
│ ├─ Inventory.java
│ └─ FileStorage.java
└─ test/java/store
├─ InventoryTest.java
└─ FileStorageTest.java
```
## ⚡ Getting Started

### 📦 Build
```bash
mvn -q -DskipTests package
▶️ Run
bash
Kodu kopyala
java -cp target/store-inventory-1.0.0.jar store.App
🧪 Test
bash
mvn -q test
🧾 Sample Output
pgsql
-- Current Stock --
P001 | Skirt | 10 pcs | price=19.99
P002 | Sweater | 5 pcs | price=29.99
P003 | Notebook A5 | 25 pcs | price=3.5

-- Update P003 to 40 --

-- Find P002 --
Product{id='P002', name='Sweater', category=CLOTHING, price=29.99}

Saved to inventory.csv

-- Loaded Stock --
P001 | Skirt | 10 pcs | price=19.99
P002 | Sweater | 5 pcs | price=29.99
P003 | Notebook A5 | 40 pcs | price=3.5
🧭 Roadmap
🔍 Product filtering by category or price range

💰 Total inventory value calculation

📝 Product price updates

🪄 JSON / SQLite persistence option

🖥️ Interactive CLI menu

👩‍💻 Author
Tuğçe Aydın
📍 Dublin, Ireland
🔗 GitHub Profile

📜 License
This project is licensed under the MIT License — see the LICENSE file for details.

🤝 Contributing
Contributions, issues and feature requests are welcome!
Feel free to fork the repo and submit a pull request.

