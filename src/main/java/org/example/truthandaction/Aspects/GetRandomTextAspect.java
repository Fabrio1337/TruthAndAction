package org.example.truthandaction.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class GetRandomTextAspect {

    @Before("execution(public void org.example.truthandaction.Game.setRandomText(..))")
    public void showTruthButtonAspect(JoinPoint joinPoint) {

        Object[] args = joinPoint.getArgs();
        String randText = args[0].toString();
        System.out.println("Your text: " + randText);
    }

    @Before("execution(public void org.example.truthandaction.Game.setRandomText(..))")
    public void showActionButtonAspect() {}
}
