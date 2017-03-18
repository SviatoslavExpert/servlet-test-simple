package com.akhambir.controllers;

import com.akhambir.ViewModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements Controller {

    public ViewModel process(HttpServletRequest request, HttpServletResponse response) {
        return new ViewModel("login");
    }

}
