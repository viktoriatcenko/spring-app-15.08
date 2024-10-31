package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.di_radio.Radio;
import ru.maxima.di_radio.RadioPlayer;
import ru.maxima.model.*;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        RadioPlayer player = context.getBean("player", RadioPlayer.class);
        RadioPlayer player1 = context.getBean("player", RadioPlayer.class);




        player.play();

        System.out.println(player == player1);

        context.close();













    }

}
