package com.example.jsp;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ServletConfig config = getServletConfig();
        PrintWriter out = resp.getWriter();
        out.print("<br/><h1>Accessing Content Parameters in Servlet 1</h1>");
        out.print("sql = " + config.getInitParameter("sql"));
        out.print("<br/>Message = " + config.getInitParameter("message"));

        out.print("<br/><h1>Accessing Content Parameters in Servlet 1</h1>");
        ServletContext application = getServletContext();
        out.print("Driver Name = " + application.getInitParameter("driver"));
        out.print("<br/>Url = " + application.getInitParameter("url"));
    }
}
