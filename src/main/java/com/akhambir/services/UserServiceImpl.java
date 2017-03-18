package com.akhambir.services;

import com.akhambir.dao.UserDao;
import com.akhambir.model.User;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User save(User user) {
        return userDao.save(user);
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
