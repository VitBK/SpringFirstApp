package ru.vitbk.springtraining;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music {


//    private ClassicalMusic() {
//
//    }

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }

    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }
//надо добавить эту зависимость чтобы работали старые аннотации
//<dependency>
//    <groupId>javax.annotation</groupId>
//    <artifactId>javax.annotation-api</artifactId>
//    <version>1.3.2</version>
//</dependency>
//    @PostConstruct
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
//    @PreDestroy
    @PreDestroy
    private void doMyDestroy() {
        System.out.println("Doing my destruction");
    }



}
