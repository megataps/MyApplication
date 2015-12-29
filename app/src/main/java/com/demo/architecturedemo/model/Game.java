package com.demo.architecturedemo.model;

public class Game {

    User mHero;
    User mEnemy;

    public Game(User hero, User enemy) {
        mHero = hero;
        mEnemy = enemy;
    }

    public User getHero() {
        return mHero;
    }

    public void setHero(User hero) {
        mHero = hero;
    }

    public User getEnemy() {
        return mEnemy;
    }

    public void setEnemy(User enemy) {
        mEnemy = enemy;
    }
}
