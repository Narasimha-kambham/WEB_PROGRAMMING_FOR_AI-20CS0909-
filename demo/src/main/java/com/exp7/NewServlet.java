package com.exp7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class NewServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession ses = request.getSession(true);
        ArrayList cart = (ArrayList) ses.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList();
            ses.setAttribute("cart", cart);
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String[] itemselected = request.getParameterValues("item");
        String itemname;

        if (itemselected != null) {
            for (int i = 0; i < itemselected.length; i++) {
                itemname = itemselected[i];
                cart.add(itemname);
            }
        }

        // Print the contents of the cart
        out.println("<html><head><title>Shopping Cart Contents</title></head>");
        out.println("<body>");
        out.println("<form action=\"" + response.encodeURL("/demo/NewServlet") + "\" method=\"post\">");

        out.println("<h1>Items currently in your cart</h1><br>");

        Iterator iterator = cart.iterator();
        while (iterator.hasNext()) {
            out.println("<p>" + iterator.next() + "</p>");
        }

        out.println("<hr>");
        out.println("<a href=\"" + response.encodeURL("/demo/NewServlet1") + "\">Back</a>");
        out.println("</form>");
        out.println("<hr>");
        out.println("</body></html>");

        out.close();
    }
}
