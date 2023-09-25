/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        
    }
    
    public void increase() {
        if (value == 5) {
            value = 5;
        }else {
            value++;
        }
    }
    
    public void decrease() {
        if (value == 0) {
            value = 0;
        }else {
            value--;
        }
    }
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        return value >= 5;
    }
}
