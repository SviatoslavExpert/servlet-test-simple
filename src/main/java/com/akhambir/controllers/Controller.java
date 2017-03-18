package com.akhambir.controllers;

import com.akhambir.ViewModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {

    ViewModel process(HttpServletRequest request, HttpServletResponse response);

}
