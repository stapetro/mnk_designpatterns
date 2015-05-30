package com.mnknowledge.dp.behavioral.templatemethod.game;

public class Chess extends SimpleGame {

    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Chess Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Chess Game Finished!");
    }
}
