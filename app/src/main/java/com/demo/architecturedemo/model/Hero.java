package com.demo.architecturedemo.model;

public class Hero extends User {

    @Override
    public void onShoot(Item item, User toUser) {
        toUser.setUserStatus(UserStatus.CONTROLLED);
    }
}
