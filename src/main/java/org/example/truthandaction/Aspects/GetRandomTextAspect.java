package org.example.truthandaction.Aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.truthandaction.texts.Action;
import org.example.truthandaction.texts.TruthText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;


@Aspect
@Component
public class GetRandomTextAspect {

    @Autowired
    public TruthText truthText;

    @Autowired
    public Action action;

    @Around("execution(public String org.example.truthandaction.texts.TruthText.getTruth(..))")
    public Object showTruthButtonAspect(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs();


        String word = (String) args[0];


        ArrayList<String> list = truthText.getTruths();


        Random rand = new Random();
        int index = rand.nextInt(list.size());


        word = list.get(index);


        System.out.println("Modified text: " + word);


        args[0] = word;


        return joinPoint.proceed(args);
    }

    @Around("execution(public String org.example.truthandaction.texts.Action.getAction(..))")
    public Object showActionButtonAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Your action button");

        Object[] args = joinPoint.getArgs();

        String word = (String) args[0];

        ArrayList<String> list = action.getActions();

        int size = list.size();

        Random rand = new Random();

        int index = rand.nextInt(size);

        word = list.get(index);

        System.out.println("Modified text: " + word);

        args[0] = word;

        return joinPoint.proceed(args);
    }

}
