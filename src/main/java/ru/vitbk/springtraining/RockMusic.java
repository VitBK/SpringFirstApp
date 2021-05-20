package ru.vitbk.springtraining;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("someRockMusic")
public class RockMusic implements Music {


    @Override
    public String getSong() {
        return "Hotel California";
    }
}
