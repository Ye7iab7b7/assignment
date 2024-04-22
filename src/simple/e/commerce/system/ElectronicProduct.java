/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple.e.commerce.system;

/**
 *
 * @author Smile
 */
public class ElectronicProduct extends Product {

    String brand;
    int warrantyPeriod;

    String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {

        if (warrantyPeriod < 0) {
            this.warrantyPeriod = Math.abs(warrantyPeriod);
        } else {
            this.warrantyPeriod = warrantyPeriod;
        };

    }

}
