package org.example.truthandaction;

import org.example.truthandaction.texts.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.truthandaction.texts", "org.example.truthandaction"})
public class AllBeans {

    @Bean
    public GameFXML gameFXML()
    {return new GameFXML();}

    @Bean
    public Action action()
    { return new Action();}

    @Bean
    public Truth truth()
    { return new Truth();}
}
