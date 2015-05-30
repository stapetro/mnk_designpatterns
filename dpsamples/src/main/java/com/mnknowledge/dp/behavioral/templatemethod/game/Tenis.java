package com.mnknowledge.dp.behavioral.templatemethod.game;

public class Tenis extends SimpleGame {

    @Override
    void initialize() {
        System.out.println("Tenis Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Tenis Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Tenis Game Finished!");
    }
}
