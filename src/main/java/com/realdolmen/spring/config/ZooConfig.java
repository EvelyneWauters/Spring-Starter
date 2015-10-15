package com.realdolmen.spring.config;

import com.realdolmen.spring.domain.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooConfig {

    @Bean
    public Zoo zoo()    {
        Zoo zoo =  new ZooImpl("EpicZoo");
        zoo.addAnimal(new Fish("Nemo"));
        zoo.addAnimal(new Otter("Freddy"));
        zoo.addAnimal(new Heron("Yoshi"));

        return zoo;
    }
}
