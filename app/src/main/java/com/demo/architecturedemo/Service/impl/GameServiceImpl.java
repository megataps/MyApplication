package com.demo.architecturedemo.Service.impl;

import com.demo.architecturedemo.Service.GameService;
import com.demo.architecturedemo.data.GameRepository;
import com.demo.architecturedemo.model.Game;

public class GameServiceImpl implements GameService {

    GameRepository mGameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        mGameRepository = gameRepository;
    }

    @Override
    public void saveGame(Game game) {
        mGameRepository.saveGame(game);
    }

    @Override
    public Game loadGame() {
        return mGameRepository.loadGame();
    }
}
