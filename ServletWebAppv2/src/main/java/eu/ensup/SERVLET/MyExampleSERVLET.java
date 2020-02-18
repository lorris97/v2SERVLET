/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.SERVLET;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lorris
 */
@WebServlet("/MyExampleSERVLET")
public class MyExampleSERVLET extends HttpServlet {
 public static final String VUE = "/MyExampleJSP.jsp";
 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);

      
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyExampleSERVLET</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Liste des 10 méthodes httpRequest  </h1>");
            out.println("<h2>- Servlet MyExampleSERVLET at " + request.getContextPath() + "</h2>");
            out.println("<h2>- Path info : " + request.getPathInfo()+ "</h2>");
            out.println("<h2>- Local adresse : " + request.getLocalAddr()+ "</h2>");
            out.println("<h2>- Méthode :  " + request.getMethod()+ "</h2>");
            out.println("<h2>- Server name : " + request.getServerName()+ "</h2>");
            out.println("<h2>- Remote host :  " + request.getRemoteHost()+ "</h2>");
            out.println("<h2>- Remote user : " + request.getRemoteUser()+ "</h2>");
            out.println("<h2>- Local name : " + request.getLocalName()+ "</h2>");
            out.println("<h2>- Protocol : " + request.getProtocol()+ "</h2>");
            out.println("<h2>- CharacterEncoding : " + request.getCharacterEncoding()+ "</h2>");
            out.println("<h2>- Querry string : " + request.getQueryString()+ "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


}
