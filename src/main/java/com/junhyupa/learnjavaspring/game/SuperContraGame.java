package com.junhyupa.learnjavaspring.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Sit");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shot");
    }
}
