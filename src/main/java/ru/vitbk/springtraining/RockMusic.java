package ru.vitbk.springtraining;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("someRockMusic")
public class RockMusic implements Music {

    private static final List<String> SONGS = new ArrayList<>();

    static {
        SONGS.add("Hotel California");
        SONGS.add("T.N.T");
        SONGS.add("Sultans of Swing");
    }

    @Override
    public List<String> getSong() {
        return SONGS;
    }
}
