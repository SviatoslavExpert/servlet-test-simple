package com.akhambir;

import com.akhambir.controllers.Controller;
import com.akhambir.controllers.HomeController;
import com.akhambir.controllers.LoginController;

public class Factory {

    public static Controller getHomeController() {
        return new HomeController();
    }

    public static Controller getLoginController() {
        return new LoginController();
    }
}
