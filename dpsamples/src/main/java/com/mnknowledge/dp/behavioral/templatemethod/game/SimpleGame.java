package com.mnknowledge.dp.behavioral.templatemethod.game;

public abstract class SimpleGame {
    
    /**
     * Define our algorithm for Simple Game Play. <br>
     * Note: This is the template method in context of Template Method Design
     * Pattern.
     */
    public final void play() {

        // initialize game
        initialize();

        // start game
        startPlay();

        // end game
        endPlay();
    }

    // Note: the methods bellow will be implemented in SimpleGame descendants.
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

}
