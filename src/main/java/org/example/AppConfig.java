package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Phone getPhone() {
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor() {
        return new Snapdragon();
    }

}
