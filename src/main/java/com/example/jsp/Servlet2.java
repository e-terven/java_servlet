package com.example.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        // Config Parameters are NOT retrieved because One-ServletConfig per Servlet (web.xml)
        out.print("<br/><h1>Accessing Content Parameters in Servlet 2</h1>");
        ServletConfig config = getServletConfig();
        out.print("sql = " + config.getInitParameter("sql"));
        out.print("<br/>Message = " + config.getInitParameter("message"));

        // Context Parameters are retrieved because One ServletContext per Application (web.xml)
        out.print("<br/><h1>Accessing Content Parameters in Servlet 2</h1>");
        ServletContext application = getServletContext();
        out.print("Driver Name = " + application.getInitParameter("driver"));
        out.print("<br/>Url = " + application.getInitParameter("url"));
    }
}
