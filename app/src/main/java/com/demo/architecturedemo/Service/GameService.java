package com.demo.architecturedemo.Service;

import com.demo.architecturedemo.model.Game;

public interface GameService {

    void saveGame(Game game);

    Game loadGame();
}
