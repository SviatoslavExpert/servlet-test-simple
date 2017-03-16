package com.akhambir;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        handleRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        handleRequest(request, response);
    }

    private void handleRequest(HttpServletRequest request, HttpServletResponse response) {
        String view = null;

        if (request.getRequestURI().equals("/")) {
            view = "home";
        }

        if (request.getRequestURI().equals("/login")) {
            view = "login";
        }

        try {
            request.getRequestDispatcher(getView(view)).forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getView(String view) {
        String prefix = "/WEB-INF/";
        String suffix = ".jsp";
        return prefix + view + suffix;
    }
}
