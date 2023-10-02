/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Logica.*;
/**
 *
 * @author JAIBER DÌAZ
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {
    
    
  public static Usuario user;  
    public static void liskov(Usuario f){
        f.setImc(f.getEstatura(), f.getPeso());
        user = f;
    }
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
       
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(request.getParameter("nombreUsuario"));
        usuario.setNumeroCelular(request.getParameter("numeroCelular"));
        usuario.setCorreoUsuario(request.getParameter("correoUsuario"));
        usuario.setEdadUsuario(request.getParameter("edadUsuario"));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setEstatura(Float.parseFloat(request.getParameter("estatura")));
        usuario.setPeso(Integer.parseInt(request.getParameter("peso")));
        //usuario.setImc(usuario.getEstatura(), usuario.getPeso());
        liskov(usuario);
        
        Rutina rutina = new Rutina();
      
        rutina.setDias(Integer.parseInt(request.getParameter("diasDisponibles")));
        rutina.setObjetivo(request.getParameter("objetivo"));
        //rutina.generarRutinaAleatoria();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Rutina Usuario</title>"); 
            out.println(" <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">"); 
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Información Personal</h1>");
            out.println("<p>Nombre: " + usuario.getNombreUsuario()+ " </p>");
           
            out.println("<p>Correo: " + usuario.getCorreoUsuario() + "</p>");
            out.println("<p>Número de Celular: " + usuario.getNumeroCelular() + "</p>");
            out.println("<p>Sexo: " + usuario.getSexo()+ "</p>");
            out.println("<p>Edad: " + usuario.getEdadUsuario()+ "</p>");
            out.println("<p>Estutura: " + usuario.getEstatura()+ "</p>");
            out.println("<p>Peso: " + usuario.getPeso()+ "</p>");
            out.println("<p>" + usuario.getImc()+ "</p>");
            out.println("<p>Objetivo de Entrenamiento: " + rutina.getObjetivo()+ "</p>");
            out.println("<p> Dias Disponibles: " + rutina.getDias()+ "</p>");
            out.println("<h2>Rutina de "+ rutina.getObjetivo()+"</h2>");
            out.println("<p>"+ rutina.getRandom5Ejercicios(rutina.getObjetivo())+" </p>");
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
