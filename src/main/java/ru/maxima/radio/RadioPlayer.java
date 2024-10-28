package ru.maxima.radio;


// Слабая зависмость
public class RadioPlayer {
    private Radio radio;

    public void playRadio() {
        radio = new RetroFM();
        radio.play();

        radio = new DynamiteFM();
        radio.play();
    }
}

interface Radio {
    void play();
}


class RetroFM implements Radio {
    @Override
    public void play() {
        System.out.println("ABBA - Money");
    }
}

class DynamiteFM implements Radio {
    @Override
    public void play() {
        System.out.println("AVICII - Levels");
    }
}


