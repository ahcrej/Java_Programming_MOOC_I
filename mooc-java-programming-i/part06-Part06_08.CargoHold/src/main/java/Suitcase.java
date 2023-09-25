/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        if (this.items.isEmpty()) {
            return 0;
        }

        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }
    
    public void addItem(Item item) {

        if ((totalWeight() + item.getWeight()) > maxWeight) {

        } else {
            this.items.add(item);
        }
    }

    // void does not require return line
    public void printItems() {
        for (Item item:items) {
            System.out.println(item);
        }
    }

    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnItem = this.items.get(0);
        
        for (Item item:this.items) {
            if (returnItem.getWeight() < item.getWeight()) {
                returnItem = item;
            }
        }
        return returnItem;
    }

    public String toString() {
        
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
