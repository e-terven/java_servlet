package com.example.jsp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;
import dto.User;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SecondServlet", value = "/SecondServlet")
public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SecondServlet() {
        super();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            User u = (User) session.getAttribute("user");
            u.setEmail(req.getParameter("email"));
            u.setAge(Integer.parseInt(req.getParameter("age")));
            session.setAttribute("user", u);
            resp.sendRedirect("three.html");
        }
    }
}
