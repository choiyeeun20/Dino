package com.yeeun.web.user;

import java.util.List;

import com.yeeun.web.util.Messenger;

public interface UserService  {

    public Messenger register(User user);

    public List<User> findAll();

    public User findOne(String userid);

    public void modify(User user);

    public void remove(User user);

}