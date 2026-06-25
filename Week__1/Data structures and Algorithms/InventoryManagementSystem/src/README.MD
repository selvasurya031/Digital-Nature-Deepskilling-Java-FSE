# Inventory Management System

## 1. Understanding the Problem

### Why are Data Structures and Algorithms Essential?

In a warehouse inventory system, thousands or even millions of products may need to be stored, searched, updated, and removed efficiently.

Data Structures and Algorithms help to:

- Organize product data efficiently.
- Reduce search and update time.
- Improve system performance and scalability.
- Handle large inventories without significant delays.
- Optimize memory usage and processing speed.

Without efficient data structures, operations such as searching or updating products can become slow as the inventory grows.

### Suitable Data Structures

Several data structures can be used for inventory management:

#### ArrayList

- Stores products in a dynamic array.
- Easy to implement.
- Suitable for small inventories.

**Advantages:**
- Dynamic size.
- Simple insertion.

**Disadvantages:**
- Searching, updating, and deleting require traversing the list.

#### HashMap (Chosen Data Structure)

- Stores products using `productId` as the key.
- Provides direct access to products.

**Advantages:**
- Fast insertion.
- Fast searching.
- Fast updating.
- Fast deletion.

**Example:**

```text
101 → Laptop
102 → Phone
103 → Shoes
```

For an inventory management system, **HashMap** is the preferred choice because it offers efficient access to products using their IDs.

---

## 4. Analysis

### Time Complexity of Operations Using HashMap

| Operation | Time Complexity |
|------------|----------------|
| Add Product | O(1) |
| Search Product | O(1) |
| Update Product | O(1) |
| Delete Product | O(1) |

### Explanation

#### Add Product

Adding a product:

```java
inventory.put(productId, product);
```

The HashMap computes a hash value and stores the product directly.

**Time Complexity:** O(1)

---

#### Update Product

Updating a product:

```java
Product p = inventory.get(productId);
p.setQuantity(newQuantity);
```

The product is retrieved directly using its key.

**Time Complexity:** O(1)

---

#### Delete Product

Deleting a product:

```java
inventory.remove(productId);
```

The HashMap locates and removes the product using its key.

**Time Complexity:** O(1)

---

### Optimization Techniques

#### 1. Use HashMap Instead of ArrayList

Using an ArrayList requires traversing elements to find a product.

```java
for(Product p : products)
```

This takes O(n) time.

Using a HashMap:

```java
inventory.get(productId);
```

takes O(1) time.

---

#### 2. Use Product ID as the Key

Using `productId` as the key enables direct access to products without searching through the entire inventory.

```java
HashMap<Integer, Product> inventory;
```

---

#### 3. Minimize Linear Searches

Avoid scanning all products whenever possible.

Instead of:

```java
for(Product p : inventoryList)
```

Use:

```java
inventory.get(productId);
```

---

#### 4. Maintain Unique Product IDs

Unique product IDs prevent duplicate entries and ensure efficient retrieval.

---

## Conclusion

A HashMap-based inventory management system provides efficient storage and retrieval of products.

- Add Operation: O(1)
- Update Operation: O(1)
- Delete Operation: O(1)

Using HashMap significantly improves performance compared to linear data structures and makes the system suitable for managing large-scale warehouse inventories.