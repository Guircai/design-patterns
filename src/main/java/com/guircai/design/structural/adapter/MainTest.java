package com.guircai.design.structural.adapter;

/**
 * 适配器模式
 */
public class MainTest {
    public static void main(String[] args) {
        // 1. 外国友人想要看电影带英文字幕
        MoviePlayer moviePlayer = new MoviePlayer();
        moviePlayer.play();
    }
}
