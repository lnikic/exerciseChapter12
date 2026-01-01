package org.example;

import java.util.Comparator;

public class Coffee {
    private String name;
    private int strength;

    public Coffee(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }



    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String toString() {
        return name;
    }
}
