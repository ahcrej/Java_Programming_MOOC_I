/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Product {

    private String item;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice,
            int initialQuantity) {
        this.item = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.item + ", price "
                + this.price + ", " + this.quantity + " pcs");
    }
}
