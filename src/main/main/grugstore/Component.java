package main.grugstore;

import java.util.List;

public abstract class Component implements Comparable<Component>{
    private String title;
    private Double weight;
    private int power;
    //private int badEffect;
    //List<c>

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
//        this.badEffect=badEffect;

    }


    @Override
    public String toString() {
        return String.format("Title=%s, Power=%s", title, power);
    }

    @Override
    public int compareTo(Component o) {
        return this.power-o.power;
//        int compare = Integer.compare(this.power - o.power);
//        return compare;
    }
}