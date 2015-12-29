package com.demo.architecturedemo.data;

import com.demo.architecturedemo.model.Game;

public interface GameRepository {

    void saveGame(Game game);

    Game loadGame();
}
