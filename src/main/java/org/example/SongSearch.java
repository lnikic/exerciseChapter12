package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SongSearch {
    private final List<Song> songs = new Songs().getSongs();

    void printTopFiveSongs() {
        List<String> topFive = songs.stream()
                .sorted(Comparator.comparingInt(Song::getTimesPlayed))
                .map(Song::getTitle)
                .limit(5)
                .toList();
        System.out.println(topFive);
    }

    void search(String artist) {
        Optional<Song> result = songs.stream()
                .filter(s -> s.getArtist().equals(artist))
                .findFirst();
        if(result.isPresent()) {
            System.out.println(result.get().getTitle());
        } else {
            System.out.println("No song found by: " + artist);
        }
    }
}
