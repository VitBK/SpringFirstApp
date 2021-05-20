package ru.vitbk.springtraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("ru.vitbk.springtraining")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genres());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> genres() {
        return List.of(classicalMusic(), rockMusic(), rapMusic());
    }
}
