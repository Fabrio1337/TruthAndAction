package org.example.truthandaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleBeansLoader {
    private static AnnotationConfigApplicationContext context;

    public static AnnotationConfigApplicationContext getContext() {
        if (context == null) {
            context = new AnnotationConfigApplicationContext(AllBeans.class);
        }
        return context;
    }
}
