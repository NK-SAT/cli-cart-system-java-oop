# CLI Cart System - Java (OOP)

A terminal-based shopping cart system implemented in Java using Object-Oriented Programming (OOP) principles. This project simulates a basic e-commerce flow where users can add products, register sellers, assign prices, apply discounts, add items to a cart, and rate products — all through a command-line interface.

---

## 📌 Features

- ✅ Add new products with descriptions
- ✅ Register sellers with name and address
- ✅ Link sellers to products with price and discount offers
- ✅ Add products to cart with best seller-price combo
- ✅ Rate products and calculate average rating
- ✅ View summaries of products, sellers, and cart items

---

## 🧱 Core Classes and Responsibilities

### `Product`
- Stores product ID, name, description
- Tracks cumulative and average ratings

### `Seller`
- Represents a seller with ID, name, and address

### `ShoppingPortal`
- Acts as the link between products and sellers
- Stores price and discount offered by a seller for a product

### `Cart`
- Represents a user’s cart entry
- Contains product, seller, price, and discount details

### `cartSystem (Main)`
- CLI-driven control flow for all operations:
  - Add product/seller
  - Assign price and discount
  - Add product to cart
  - Add rating to a product

---

## 🧪 Sample CLI Options
Press 1 to add product
Press 2 to add seller
Press 3 to add price
Press 4 to add the product in the cart
Press 5 to enter rating
Press 6 to exit

## 🛠️ Technologies Used

- Java (Standard Edition)
- Java Collections (`ArrayList`, `Scanner`)
- Object-Oriented Programming Concepts

---

## 💡 Learning Outcomes

This project was built to strengthen understanding of:

- **Encapsulation, Abstraction, and Class Relationships**
- **Managing Object State**
- **Simple in-memory storage with collections**
- **Command-line interactivity in Java**

---

## 🚀 Getting Started

### Run Locally

1. Clone the repo:
    ```bash
    git clone https://github.com/your-username/cli-cart-system-java-oop.git
    ```
2. Open in any Java IDE or use terminal:
    ```bash
    javac cartSystem.java
    java cartSystem
    ```

> Ensure all classes (`Product`, `Seller`, `Cart`, `ShoppingPortal`) are in the same directory.
## 📚 License
This project is for educational purposes and does not include a license.
## 🙋‍♂️ Author

*Nithish Kumar*
