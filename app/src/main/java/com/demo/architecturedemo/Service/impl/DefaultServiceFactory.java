package com.demo.architecturedemo.Service.impl;

import com.demo.architecturedemo.Service.GameService;
import com.demo.architecturedemo.Service.ServiceFactory;
import com.demo.architecturedemo.data.impl.GameRepositoryImpl;

public class DefaultServiceFactory implements ServiceFactory {

    GameService mGameService;

    public DefaultServiceFactory() {
        mGameService = new GameServiceImpl(new GameRepositoryImpl());
    }

    @Override
    public GameService getGameService() {
        return null;
    }

}
