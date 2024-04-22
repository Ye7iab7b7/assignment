/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple.e.commerce.system;

/**
 *
 * @author Smile
 */
import java.lang.reflect.Array;
import java.util.*;

public class Cart {

    int counter = 0;
    int customerId;
    int nProduct;
    Product[] products;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getnProduct() {
        return nProduct;
    }

    public void setnProduct(int nProduct) {
        this.nProduct = Math.abs(nProduct);
        products = new Product[nProduct];

    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products[counter] = p;
        counter++;

    }

    public void removeProduct(Product p) {
        Product[] products2 = new Product[getnProduct() - 1];
        int indexRemoved = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == p.getProductId()) {
                indexRemoved = i;
                break;

            }
        }
        int p2_iterator = 0;
        for (int i = 0; i < products.length; i++) {
            if (i != indexRemoved) {
                products2[p2_iterator] = products[i];
                p2_iterator++;
            }

        }
        setnProduct(getnProduct() - 1);
        setProducts(products2);

    }

    public float calculatePrice() {
        float totalPrice = 0;
        for (int i = 0; i < nProduct; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }

    public boolean placeOrder(int place) {
        if (place == 1) {
            return true;
        } else {
            return false;
        }

    }

}
