package com.exp7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NewServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs)
            throws ServletException, IOException {

        HttpSession s = rq.getSession();
        int itemcount = 0;
        ArrayList cart;

        cart = (ArrayList) s.getAttribute("cart");

        if (cart != null)
            itemcount = cart.size();

        rs.setContentType("text/html");
        PrintWriter p = rs.getWriter();

        p.println("<html><head><title>Shopping Cart 1</title></head><body>");
        p.println("<h1>Welcome to the shopping cart</h1>");
        p.println("<p>You've " + itemcount + " items in your cart</p>");

        p.println("<form action=\"" + rs.encodeURL("http://localhost:8080/demo/NewServlet") + "\" method=\"post\">");

        p.println("<p><input type=\"checkbox\" name=\"item\" value=\"java\">Item1: JAVA</p>");
        p.println("<p><input type=\"checkbox\" name=\"item\" value=\"python\">Item2: Python</p>");
        p.println("<p><input type=\"checkbox\" name=\"item\" value=\"c++\">Item3: C++</p>");
        p.println("<p><input type=\"checkbox\" name=\"item\" value=\"c#\">Item4: C#</p>");

        p.println("<p><input type=\"submit\" value=\"Add to cart\"></p>");
        p.println("</form></body></html>");

        p.close();
    }
}
