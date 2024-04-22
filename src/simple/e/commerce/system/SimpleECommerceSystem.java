/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple.e.commerce.system;

import java.util.Scanner;

/**
 *
 * @author Smile
 */
public class SimpleECommerceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to E-commerce System");
        // product1
        ElectronicProduct p1 = new ElectronicProduct();
        p1.setName("smartphone");
        p1.setProductId(1);
        p1.setPrice(599.9f);
        p1.setBrand("Samsung");
        p1.setWarrantyPeriod(1);
        // product2
        ClothingProduct p2 = new ClothingProduct();
        p2.setName("T-shirt");
        p2.setProductId(2);
        p2.setPrice(19.99f);
        p2.setSize("Medium");
        p2.setFabric("Cotton");
        // product3
        BookProduct p3 = new BookProduct();
        p3.setName("OOP");
        p3.setProductId(3);
        p3.setPrice(39.99f);
        p3.setAuthor("O'Reilly");
        p3.setPublisher("X Publications");
        // customer
        Customer c = new Customer();
        System.out.println("Please enter your id:");
        int id = input.nextInt();
        System.out.println("Please enter your name:");
        String name = input.next();
        System.out.println("Please enter your address:");
        String address = input.next();
        c.setCustomerId(id);
        c.setName(name);
        c.setAddress(address);

        Order o = new Order();
        o.setCustomerId(id);
        Cart cart = new Cart();
        System.out.println("How many producs you want to add to cart?");
        int nProduct = input.nextInt();
        cart.setnProduct(nProduct);
        for (int i = 0; i < nProduct; i++) {
            System.out.println("which product you would like to add? 1-smartphone 2-T-shirt 3-OOP");
            int product = input.nextInt();
            switch (product) {
                case 1:
                    cart.addProduct(p1);
                    break;
                case 2:
                    cart.addProduct(p2);
                    break;
                case 3:
                    cart.addProduct(p3);
                    break;
                default:
                    System.out.println("Product is not available");
                    break;
            }

        }
        System.out.println("Do you want to remove any product from the cart?1-Yes 2-No");
        int removeProduct = input.nextInt();
        if (removeProduct == 1) {
            while (true) {
                System.out.println("How many products do you want to remove?");
                int removedProducts = input.nextInt();
                if (removedProducts > nProduct) {
                    System.out.println("Not valid number");
                } else {
                    for (int i = 0; i < removedProducts; i++) {
                        System.out.println("which product you would like to remove? 1-smartphone 2-T-shirt 3-OOP");
                        int product = input.nextInt();
                        switch (product) {
                            case 1:
                                cart.removeProduct(p1);
                                break;
                            case 2:
                                cart.removeProduct(p2);
                                break;
                            case 3:
                                cart.removeProduct(p3);
                                break;
                            default:
                                System.out.println("Product is not available");
                                break;
                        }

                    }
                    break;
                }

            }

        }
        o.setProducts(cart.getProducts());
        o.setTotalPrice(cart.calculatePrice());
        System.out.println("Your total is $" + cart.calculatePrice() + ". Do you want to place your order? 1-Yes 2-No");
        int placeOrder = input.nextInt();
        if (cart.placeOrder(placeOrder)) {
            o.printOrderInfo();
        }
    }

}
