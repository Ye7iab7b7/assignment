/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple.e.commerce.system;

/**
 *
 * @author Smile
 */
public class Customer {

    int customerId;
    String name;
    String address;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
       if (customerId < 0) {
            this.customerId = Math.abs(customerId);
        } else {
            this.customerId = customerId;
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
