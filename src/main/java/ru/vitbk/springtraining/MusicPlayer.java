package ru.vitbk.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;

//    private Music music1;
//    private Music music2;

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("someRockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        int index = new Random().nextInt(3);
        System.out.println(musicList.get(index).getSong());
    }

    //    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }


    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public String playMusic() {
//        return "Playing: " + music1.getSong() + "\nPlaying: " + music2.getSong();
////        return "Playing: " + classicalMusic.getSong() +
////        "\nPlaying: " + rockMusic.getSong();
//    }

//    public MusicPlayer() {
//
//    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }


//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
//
//    public void playMusic() {
//        musicList.forEach(music -> System.out.println("Playing: " + music.getSong()));
//    }
}
