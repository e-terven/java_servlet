package com.example.jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        RequestDispatcher rd;
        if (username.equalsIgnoreCase("tom") && password.equals("jerry")) {
            rd = req.getRequestDispatcher("SuccessServlet");
            rd.forward(req, resp);
        } else {
            rd = req.getRequestDispatcher("login.html");
            PrintWriter out = resp.getWriter();
            rd.include(req, resp);
            out.println("<center> <spam style = 'color:red'> Invalid Credentials! </span></center>");
        }
    }
}
