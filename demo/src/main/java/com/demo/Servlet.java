package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {

        rs.setContentType("text/html");
        PrintWriter out = rs.getWriter();

        HttpSession session = rq.getSession(true);
        Integer count = (Integer) session.getAttribute("NewServlet.HitCount");

        if (count == null) {
            count = Integer.valueOf(1);  // modern and safe
        } else {
            count = Integer.valueOf(count + 1);
        }

        session.setAttribute("NewServlet.HitCount", count);

        out.println("<html><head><title>Session Example</title></head>");
        out.println("<body><h4>Session server to demonstrate session tracking and its life cycle</h4>");

        out.println("<br>Session status: ");
        if (session.isNew()) {
            out.println("New session<br>");
        }

        out.println("HitCount for your current session is: " + count + "<br>");

        out.println("<h2>Some basic session information</h2>");
        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Is it a new session: " + session.isNew() + "<br>");
        out.println("Session creation time: " + session.getCreationTime() + "<br>");
        out.println("(" + new Date(session.getCreationTime()) + ")<br>");
        out.println("Last accessed time: " + session.getLastAccessedTime() + "<br>");
        out.println("(" + new Date(session.getLastAccessedTime()) + ")<br>");
        out.println("Max inactive interval: " + session.getMaxInactiveInterval() + " seconds<br>");
        out.println("Session info as in cookie: " + rq.isRequestedSessionIdFromCookie() + "<br>");

        out.println("</body></html>");
    }
}
