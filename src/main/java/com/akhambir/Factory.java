package com.akhambir;

import com.akhambir.controllers.Controller;
import com.akhambir.controllers.HomeController;
import com.akhambir.controllers.LoginController;
import com.akhambir.controllers.RegistrationController;
import com.akhambir.dao.UserDao;
import com.akhambir.dao.UserDaoImpl;
import com.akhambir.services.UserService;
import com.akhambir.services.UserServiceImpl;

import java.sql.Connection;

public class Factory {

    public static Controller getHomeController() {
        return new HomeController();
    }

    public static Controller getLoginController() {
        return new LoginController();
    }

    public static Controller getRegistrationController(UserService userService) {
        return new RegistrationController(userService);
    }

    public static UserService getUserServiceImpl(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }

    public static UserDao getUserDaoImpl(Connection connection) {
        return new UserDaoImpl(connection);
    }

    public static Connection getConnection() {
        return null;
    }
}
