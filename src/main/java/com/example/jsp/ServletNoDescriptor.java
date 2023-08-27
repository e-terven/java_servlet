package com.example.jsp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletNoDescriptor", value = "/ServletNoDescriptor", urlPatterns = "servlet-no-descriptor")
public class ServletNoDescriptor extends HttpServlet {
    public String message;

    public void init() {
        message = "Look at this, no WEB-XML!";

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            out.printf("""
                        <html>
                            <head>
                                <title>Servlet Meori</title>
                            </head>
                            <body>
                                <h2>Servlet Meori at %s</h2>
                                <br/>Again and Again!
                                <br/>%s
                            </body>
                        </html>
                        """, request.getContextPath(), message);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
