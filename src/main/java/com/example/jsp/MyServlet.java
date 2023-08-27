package com.example.jsp;


import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {

    // .service() method has the highest priority
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.print("<h1>Hello World, Service Method");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fname");
        out.print("<h1>Hello World, doGet Method");
        out.print("<br/> Hello " + name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("fname");
        out.print("<h1>Hello World, doPost Method");
        out.print("<br/> Hello " + name);
    }
}
