package ru.vitbk.springtraining;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private static final List<String> SONGS = new ArrayList<>();

    static {
        SONGS.add("Hungarian Rhapsody");
        SONGS.add("Moonlight Sonata");
        SONGS.add("The Four Seasons");
    }

//    private ClassicalMusic() {
//
//    }

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }

    @Override
    public List<String> getSong() {
        return SONGS;
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
