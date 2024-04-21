package org.music.genres;

import org.music.Music;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }
    @Override
    public  String getSong() {
        return "Wind cries Mary";
    }

}
