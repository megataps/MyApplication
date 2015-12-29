package com.demo.architecturedemo.model;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private List<Item> mItemList;
    private UserStatus mUserStatus;

    public UserStatus getUserStatus() {
        return mUserStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        mUserStatus = userStatus;
    }

    public List<Item> getItemList() {
        return mItemList;
    }

    public void setItemList(List<Item> itemList) {
        mItemList = itemList;
    }

    public void addItem(Item item) {
        if(mItemList == null) {
            mItemList = new ArrayList<>();
        }

        mItemList.add(item);
    }

    public void removeItem(Item item) throws Exception{
        if(mItemList == null) {
            throw new NullPointerException("Item list in null");
        }

        Item itemWillRemove = null;
        for(Item i : mItemList) {
            if(i.getId() == item.getId()) {
                itemWillRemove = i;
                break;
            }
        }

        if(itemWillRemove != null) {
            mItemList.remove(itemWillRemove);
        }
    }

    public abstract void onShoot(Item item, User toUser);
}
