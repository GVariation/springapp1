package ru.bubblegum.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    public String getSong() {
        return "Wind cries Mary";
    }
}
