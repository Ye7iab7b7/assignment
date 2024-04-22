/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple.e.commerce.system;

/**
 *
 * @author Smile
 */
public class Order {

    int customerId;
    int orderId = 0;
    int nProduct;
    Product[] products = new Product[nProduct];
    float totalPrice;

    public Order() {
        orderId++;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void printOrderInfo() {
        System.out.println("Here's your order's detiles ");
        System.out.println("order id: " + orderId);
        System.out.println("customer's id: " + getCustomerId());
        System.out.println("Products: ");
        for (Product product : products) {
            System.out.println(product.getName() + " $" + product.getPrice());
        }
        System.out.println("Total price: $" + getTotalPrice());

    }
}
