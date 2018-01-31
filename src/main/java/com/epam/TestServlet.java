package com.epam;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestServlet extends HttpServlet {

    private  String login;
    private  String password;

    private final static String loginAdmin = "admin";
    private final static String passwordAdmin = "admin";

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {

        httpServletResponse.setContentType("text/html");

        login = httpServletRequest.getParameter("login");
        password = httpServletRequest.getParameter("password");

        List<SomeClass> list = new ArrayList<SomeClass>();

        list.add(new SomeClass("Oleg", 21 , 182, "male"));
        list.add(new SomeClass("Misha", 17 , 190, "male"));
        list.add(new SomeClass("Vika", 19 , 165, "female"));
        list.add(new SomeClass("Artem", 15 , 178, "male"));



        HttpSession session =  httpServletRequest.getSession();

        if ((login.equalsIgnoreCase(loginAdmin)) && (password.equals(passwordAdmin))) {
//            httpServletRequest.setAttribute("list", list);
            session.setAttribute("login",httpServletRequest.getParameter("login") );
            session.setAttribute("list" , list);

            httpServletResponse.sendRedirect("welcome.jsp");
        } else {
            httpServletResponse.sendRedirect("index.jsp");
        }
    }

}