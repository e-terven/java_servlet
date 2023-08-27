package com.example.jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletSimple extends HttpServlet {
    private String message;
    @Override
    public void init() {
        message = "Welcome to My Balanced Life Planning App";
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset-UTF-8");
        try(PrintWriter out = response.getWriter()) {
            out.printf("""
                        <html>
                            <head>
                                <title>Servlet Meori</title>
                            </head>
                            <body>
                                <h2>Servlet Meori at %s</h2>
                                <br/>%s
                            </body>
                        </html>
                        """, request.getContextPath(), message);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try(PrintWriter out = response.getWriter()) {
            out.printf("""
                        <html>
                            <head>
                                <title>Servlet Meori</title>
                            </head>
                            <body>
                                <h2>Servlet Meori at %s</h2>
                                <br/>%s
                            </body>
                        </html>
                        """, request.getContextPath(), message);
        }
    }
}
