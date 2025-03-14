package org.example.truthandaction.Aspects;

import org.aspectj.lang.annotation.Pointcut;

public class GetRandomTextPointcuts {
    @Pointcut("execution(* showTruthButton())")
    public void showTruthButtonPointcut() {}

    @Pointcut("execution(* showActionButton())")
    public void showActionButtonPointcut() {}
}
