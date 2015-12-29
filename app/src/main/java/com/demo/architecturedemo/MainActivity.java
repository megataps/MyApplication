package com.demo.architecturedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demo.architecturedemo.model.Boom;
import com.demo.architecturedemo.model.Enemy;
import com.demo.architecturedemo.model.Game;
import com.demo.architecturedemo.model.Hero;
import com.demo.architecturedemo.model.Item;
import com.demo.architecturedemo.model.MagicBall;
import com.demo.architecturedemo.model.User;

public class MainActivity extends AppCompatActivity {

    User mHero;
    User mEnemy;
    Game mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Game game = GameApplication.getServiceFactory().getGameService().loadGame();
        if(game != null) {
            mGame = game;
        } else {
            mHero = new Hero();
            Item magicBall = new MagicBall();
            mHero.addItem(magicBall);

            Item boom = new Boom();
            mHero.addItem(boom);

            mEnemy = new Enemy();

            mGame = new Game(mHero, mEnemy);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        GameApplication.getServiceFactory().getGameService().saveGame(mGame);
    }

    public void shootEnemy() {
        mHero.onShoot(new MagicBall(), mEnemy);
    }

}
