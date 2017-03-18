package com.akhambir.dao;

import com.akhambir.model.User;

import java.sql.Connection;

public class UserDaoImpl implements UserDao {

    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User save(User user) {
        //user jdbc from prev lessons
        return user;
    }

    @Override
    public User getByName(User user) {
        return null;
    }

    @Override
    public User remove(User user) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}
