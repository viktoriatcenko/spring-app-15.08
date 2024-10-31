package ru.maxima.di_radio;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("player")
public class RadioPlayer {



    private Radio radio;

    @Autowired
    public void setRadio(@Qualifier("maximum") Radio radio) {
        this.radio = radio;
    }


    // init method
    @PostConstruct
    public void onStart() {
        System.out.println("Bean has been initialized");
    }

    @Value("${radioPlayer.name}")
    private String name;

    @Value("${radioPlayer.volume}")
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

//    public void setRadio(Radio radio) {
//        this.radio = radio;
//    }

    public void play() {
        System.out.println("Player's name is " + this.name);
        System.out.println("Playing : " + radio.getSong());
        System.out.println("Current volume is " + this.volume);

    }


    // destroy method
    @PreDestroy
    public void onFinish() {
        System.out.println("Bean will be destroyed");
    }
}
