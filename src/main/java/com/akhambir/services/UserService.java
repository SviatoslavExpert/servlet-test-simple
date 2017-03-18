package com.akhambir.services;

import com.akhambir.model.User;

public interface UserService {

    User save(User user);

    User getByName(User user);

    User remove(User user);

    User update(User user);

}
