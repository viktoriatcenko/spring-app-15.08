package ru.maxima;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.config.SpringConfig;
import ru.maxima.di_radio.Radio;
import ru.maxima.di_radio.RadioPlayer;
import ru.maxima.model.*;

import java.lang.reflect.AnnotatedArrayType;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        RadioPlayer player = context.getBean("player", RadioPlayer.class);
        RadioPlayer player1 = context.getBean("player", RadioPlayer.class);

        player.play();

        System.out.println(player == player1);

        context.close();













    }

}
