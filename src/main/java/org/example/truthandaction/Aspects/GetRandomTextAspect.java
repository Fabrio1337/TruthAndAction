package org.example.truthandaction.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GetRandomTextAspect {

    @Before("org.example.truthandaction.Aspects.GetRandomTextPointcuts.showTruthButtonPointcut()")
    public void showTruthButtonAspect() {}

    @Before("org.example.truthandaction.Aspects.GetRandomTextPointcuts.showActionButtonPointcut()")
    public void showActionButtonAspect() {}
}
