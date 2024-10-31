package ru.maxima.di_radio;

import org.springframework.stereotype.Component;

@Component("retro")
public class RetroFM implements Radio{
    @Override
    public String getSong() {
        return "ABBA - Money";
    }
}
