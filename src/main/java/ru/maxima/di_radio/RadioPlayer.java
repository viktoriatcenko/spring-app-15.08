package ru.maxima.di_radio;

public class RadioPlayer {

    public void onStart() {
        System.out.println("Bean has been initialized");
    }

    private Radio radio;
    private String name;
    private Integer volume;

    public Radio getRadio() {
        return radio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

//    public RadioPlayer(Radio radio) {
//        this.radio = radio;
//    }

    public void play() {
        System.out.println("Player's name is " + this.name);
        System.out.println("Playing : " + radio.getSong());
        System.out.println("Current volume is " + this.volume);

    }


    public void onFinish() {
        System.out.println("Bean will be destroyed");
    }
}
