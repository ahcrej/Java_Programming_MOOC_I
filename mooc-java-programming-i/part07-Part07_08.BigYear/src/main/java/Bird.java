/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class Bird {

    private String name;
    private String latin;
    public int observation;
    boolean hasBird;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
        this.hasBird = true;
    }

    public String getName() {
        return name;
    }

    public void addObservation() {
        observation++;
    }

    public int getObservation() {
        return observation;
    }

    @Override
    public String toString() {
        return name + " (" + latin + "): " + observation + " observations";

    }
}
