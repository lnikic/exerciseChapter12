package org.example;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Coffee> coffees = new Coffees().getListCoffees();

        Optional<String> afternoonCoffee = coffees.stream()
                .map(Coffee::getName)
                .sorted()
                .findFirst();
        System.out.println(afternoonCoffee);

        SongSearch songSearch = new SongSearch();
        songSearch.printTopFiveSongs();
        songSearch.search("The Beatles");
        songSearch.search("The Beach Boys");
    }
}