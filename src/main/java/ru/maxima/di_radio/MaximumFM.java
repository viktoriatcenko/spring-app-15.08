package ru.maxima.di_radio;

import org.springframework.stereotype.Component;

@Component("maximum")
public class MaximumFM implements Radio {
    @Override
    public String getSong() {
        return "Nirvana - Lithium";
    }
}
