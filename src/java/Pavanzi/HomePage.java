/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pavanzi;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan Eka
 */
@WebServlet(name = "HomePage", urlPatterns = {"/HomePage"})
public class HomePage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home</title>"); 
            out.println("<style type='text/css'>");
            out.println("a{");
            out.println("text-decoration: none;");
            out.println("color: white;");
            out.println("font-weight: bold");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body style='margin: 0px; font-family: raleway; color: white;'>");
            out.println("<header id='header' style='background-color: black; position: fixed; width: 100%'>");
            out.println("<nav style='padding-left: 160px; height: 50px; display: flex'>");
            out.println("<span style='display: flex; align-items: center;'>");
            out.println("<a href='Home.html' style='text-decoration: none'>");
            out.println("<h1 style='color: white; font-family: raleway'>");
            out.println("Favanzi");
            out.println("</h1>");
            out.println("</span>");
            out.println("<ul id='navbar_right' style='display: flex; position: absolute; right: 0px; margin-right: 160px; list-style-type: none;'>");
            out.println("<li>");
            out.println("<a href='Home.html'>");
            out.println("</a>");
            out.println("</li>");
            out.println("<li>");
            out.println("<a href='About.html' style='margin-left: 15px'>");
            out.println("ABOUT");
            out.println("</a>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</span>");
            out.println("</nav>");
            out.println("</header>");
            out.println("<div style='padding-top: 100px; padding-bottom: 100px; padding-left: 160px; padding-right: 160px'>");
            out.println("<input type='text' name='search' style='border-width: 5px; border-color: black; padding: 10px' placeholder='SEARCH'>");
            out.println("<button style='height: 45px; width: 45px; background-color: black; border: none; margin-left: 10px; padding: 0px; cursor: pointer'>");
            out.println("<img src='image/Search.png' style='height: 25px; width: 25px; margin: 10px'>");
            out.println("</button>");
            out.println("</div>");
            out.println("<hr style='margin-top: 50px'>");
            out.println("</div>");
            out.println("<footer style='background-color: black; padding-left: 160px; padding-right: 160px; height: 50px; display: flex; align-items: center'>");
            out.println("<h5 style='color: white; font-family: raleway'>");
            out.println("© FAVANZI, 2018.");
            out.println("</h5>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
