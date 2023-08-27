package com.example.jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "SuccessServlet", value = "/SuccessServlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h4> Welcome " + req.getParameter("username") +
                " Login Successful at " + new Date() + "</h4>");

    }
}
