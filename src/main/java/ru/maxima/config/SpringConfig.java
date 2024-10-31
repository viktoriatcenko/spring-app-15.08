package ru.maxima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.maxima.di_radio.RadioPlayer;

@Configuration
@ComponentScan("ru.maxima")
@PropertySource("classpath:player.properties") // class path это путь к папке main
public class SpringConfig {

    @Bean
    public RadioPlayer radioPlayer() {
       return new RadioPlayer();
    }


}
