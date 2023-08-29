package com.example.jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;
import dto.User;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User u = new User();
        u.setFname(req.getParameter("fname"));
        u.setLname(req.getParameter("lname"));

        HttpSession session = req.getSession();
        session.setAttribute("user", u);

        resp.sendRedirect("two.html");

    }
}
