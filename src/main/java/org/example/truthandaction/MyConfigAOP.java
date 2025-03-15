package org.example.truthandaction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.truthandaction")
@EnableAspectJAutoProxy
public class MyConfigAOP {
}
