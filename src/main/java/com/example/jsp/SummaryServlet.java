package com.example.jsp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;
import dto.User;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SummaryServlet", value = "/SummaryServlet")
public class SummaryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SummaryServlet() {
        super();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            User u = (User) session.getAttribute("user");
            u.setCity(req.getParameter("city"));
            u.setContact(Integer.parseInt(req.getParameter("contact")));
            session.setAttribute("user", u);

            PrintWriter out = resp.getWriter();
            out.println("<h2> Hello " + u.getEmail() + " </h2>");
            out.println("<h3> Details .. " + u + " </h3>");
            out.println("<h4> Session ID is " + session.getId() + " </h4>");
            out.println("<h4> Session created at " + session.getCreationTime() + " </h4>");
            session.invalidate();

        }
    }
}
