[![Build](https://github.com/Tugceaydinn/store-inventory/actions/workflows/ci.yml/badge.svg)](https://github.com/Tugceaydinn/store-inventory/actions/workflows/ci.yml) ![Java](https://img.shields.io/badge/Java-17-informational?logo=openjdk) ![Maven](https://img.shields.io/badge/Maven-ready-informational?logo=apache-maven) ![JUnit](https://img.shields.io/badge/Tests-JUnit5-green?logo=java) ![License: MIT](https://img.shields.io/badge/License-MIT-green.svg) A **clean and simple inventory management system** built with **Java** and **Maven**. This project demonstrates solid **object-oriented design**, **interface-based architecture**, **CSV file persistence**, and **unit testing** using JUnit 5. --- ## ✨ Features - ➕ Add / ✏️ Update / ❌ Remove products - 🧾 In-memory stock management with InventoryItem - 💾 Save and load inventory as CSV via FileStorage - 🧪 Unit tests with **JUnit 5** - 🖥️ Simple console demo (App.java) --- ## 🧰 Tech Stack - ☕ **Java 17** - 🧭 Maven build system - 🧪 JUnit 5 testing framework - 📄 Plain CSV file storage

## Project Structure

📁 Project Structure
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
