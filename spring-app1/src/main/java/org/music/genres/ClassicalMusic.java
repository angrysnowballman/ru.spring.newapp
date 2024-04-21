package org.music.genres;


import org.music.Music;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {


    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }



    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }

}
