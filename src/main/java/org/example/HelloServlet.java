package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
//    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        System.out.println("Hello World!");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World!</b></h2>");
//        res.getWriter().println("Hello World!");
    }
}
