package ru.vitbk.springtraining;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "It was a good day";
    }
}
