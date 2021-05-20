package ru.vitbk.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music musicBean = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer1 == musicPlayer2);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//
//        musicPlayer1.setVolume(10);
//        System.out.println(musicPlayer1.getVolume());
//        System.out.println(musicPlayer2.getVolume());
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//        Music musicBean = context.getBean("someRockMusic", RockMusic.class);
//        System.out.println(musicBean.getSong());
//        Music musicBean1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(musicBean1.getSong());
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.playMusic(Genre.CLASSICAL));
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);


        context.close();
    }
}
