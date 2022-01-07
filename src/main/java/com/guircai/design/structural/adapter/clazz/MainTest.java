package com.guircai.design.structural.adapter.clazz;

import com.guircai.design.structural.adapter.MoviePlayer;

public class MainTest {
    public static void main(String[] args) {
        MoviePlayer palyer = new MoviePlayer();
        EnMoviePlayerAdapter adapter = new EnMoviePlayerAdapter(palyer);

        adapter.play();
    }
}
