package com.akhambir.controllers;

import com.akhambir.ViewModel;
import com.akhambir.model.User;
import com.akhambir.services.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationController implements Controller {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ViewModel process(HttpServletRequest request, HttpServletResponse response) {
        ViewModel vm = new ViewModel();
        User user = new User();

        user.setUsername((String) request.getAttribute("username"));
        user.setPassword((String) request.getAttribute("password"));
        user.setEmail((String) request.getAttribute("email"));

        userService.save(user);

        vm.setView("postProcPage");

        return vm;
    }
}
