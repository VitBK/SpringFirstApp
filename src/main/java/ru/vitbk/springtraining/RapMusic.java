package ru.vitbk.springtraining;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {

    @Override
    public List<String> getSong() {
        return null;
    }
}
