package Operaciones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "producto", urlPatterns = {"/producto"})
public class producto extends HttpServlet {
variables var =new variables();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            double xuno=Double.parseDouble(request.getParameter("x1"));
            double yuno=Double.parseDouble(request.getParameter("y1"));
            double xdos=Double.parseDouble(request.getParameter("x2"));
            double ydos=Double.parseDouble(request.getParameter("y2"));
            

            double resultado=xuno*xdos+yuno*ydos;
             out.println("<html>");
        out.println("<head><title>Respuesta a Calculadora del Servlet</title><style>\n"
                + "            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n"
                + "        </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%; background-color:salmon; font-family: Roboto Condensed;\">");
                   out.print("<br><br><br><br><br><br><br><br><br><br><br>");
                out.println("<center><Font color=\"white\" size=\"12\">Resultado: " + resultado + "</Font> </center>");
                out.println("</div></body></html>");
   
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
