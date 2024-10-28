package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.di_radio.Radio;
import ru.maxima.di_radio.RadioPlayer;
import ru.maxima.model.*;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");




//        Radio radio1 = context.getBean("maximum", Radio.class);
//        RadioPlayer player = new RadioPlayer(radio1);
//
//        player.play();
//
//        Radio radio2 = context.getBean("retro", Radio.class);
//
//        player = new RadioPlayer(radio2);


        RadioPlayer player1 = context.getBean("player", RadioPlayer.class);
        player1.play();



        RadioPlayer player2 = context.getBean("player", RadioPlayer.class);


        System.out.println(player1 == player2);

        context.close();














//        Cat cat = context.getBean("catBean", Cat.class);
//
//        Dog dog = context.getBean("dogBean", Dog.class);
//
//        Duck duck = context.getBean("duck", Duck.class);
//
//        Tiger tiger = context.getBean("tiger", Tiger.class);
//
//        Wolf wolf = context.getBean("wolfBean", Wolf.class);
//
//        wolf.setName("Wolf");
//        wolf.setAge(10);
//
//        System.out.println(cat.getName());
//
//        System.out.println(dog.getAge());
//
//        System.out.println(duck.getName());
//        System.out.println(duck.getAge());
//
//        System.out.println(tiger.getSpeed() + " " + tiger.getHeight() + " " + tiger.getWeight());
//
//        System.out.println(wolf.getName());
//        System.out.println(wolf.getAge());


    }

}
