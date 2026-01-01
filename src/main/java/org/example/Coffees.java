package org.example;

import java.util.List;

public class Coffees {
    public List<Coffee> getListCoffees() {
        return List.of(
                new Coffee("Cappuccino", 1),
                new Coffee("Americano", 5),
                new Coffee("Espresso", 4),
                new Coffee("Cortado", 3),
                new Coffee("Mocha", 2),
                new Coffee("Cappuccino", 1),
                new Coffee("Flat White", 2),
                new Coffee("Latte", 3),
                new Coffee("Decaf Cappuccino", 1)
        );
    }
}
