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

public class Recipe {
    private ArrayList<String> recipes;
    
    public Recipe() {
        this.recipes = new ArrayList<>();
    }
    
    public void add(String text) {
        this.recipes.add(text);
    }
    
    public int getSize() {
        return this.recipes.size();
    }
    
    public String getString(int i) {
        return this.recipes.get(i);
    }
    
    @Override 
    
    public String toString() {
    return " " + this.recipes;
}
}
    
    

