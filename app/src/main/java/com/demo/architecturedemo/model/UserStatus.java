package com.demo.architecturedemo.model;

public enum UserStatus {
    ALIVE(0),
    DIE(1),
    CONTROLLED(2);

    int mCode;

    UserStatus(int code) {
        mCode = code;
    }
}
