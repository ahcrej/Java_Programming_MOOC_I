/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Container {

    private int storage;

    public Container() {
        this.storage = 0;
    }

    public int contains() {
        return this.storage;
    }
    
//    public void set(int amount) {
//        this.storage = amount;
//    }

    public void add(int amount) {
        if (amount > 0) {
            this.storage += amount;
        }
        if (this.storage > 100) {
            this.storage = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.storage -= amount;
        }
        if (this.storage < 0) {
            this.storage = 0;
        }
    }
    
    @Override
    
    public String toString() {
        return this.storage + "/100";
    }
}
