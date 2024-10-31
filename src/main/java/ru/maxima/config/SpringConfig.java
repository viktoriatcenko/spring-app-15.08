package ru.maxima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.maxima")
@PropertySource("classpath:player.properties") // class path это путь к папке main
public class SpringConfig {
}
