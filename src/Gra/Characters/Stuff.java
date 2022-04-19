package Gra.Characters;

import java.util.Random;

public class Stuff {
    private String name;
    private double weight;

    public Stuff(){
    }

    public String toString(){
        return "name: " +this.name +" weight: " +this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
