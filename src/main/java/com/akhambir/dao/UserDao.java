package com.akhambir.dao;

import com.akhambir.model.User;

public interface UserDao {

    User save(User user);

    User getByName(User user);

    User remove(User user);

    User update(User user);
}
