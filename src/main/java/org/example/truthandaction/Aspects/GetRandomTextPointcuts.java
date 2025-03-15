package org.example.truthandaction.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class GetRandomTextPointcuts {
    @Pointcut("execution(public void org.example.truthandaction.Game.setRandomText(..))")
    public void setTextPointcut() {}

}
