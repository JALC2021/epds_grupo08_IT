/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CocheModelo;
import Modelo.persistencia.DatosParking;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ParkingServlet", urlPatterns = {"/ParkingServlet"})
public class ParkingServlet extends HttpServlet {

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
        /*Aquí comienza la implementación de nuestro código*/
        HttpSession session = request.getSession(false); //Para crear la sesión, siempre inicializamos a false
        if (session != null) {
            //Se llama al modelo
            List<CocheModelo> coches = DatosParking.cochesZonaAzul();

            String accion = request.getParameter("accion");

            if (accion.equalsIgnoreCase("consultarAparcamiento")) {

                session.setAttribute("coches", coches);
                String url = "/index.jsp";

                ServletContext sc = getServletContext();
                RequestDispatcher rd = sc.getRequestDispatcher(url);
                rd.forward(request, response);

            }// else if (accion.equalsIgnoreCase("buscar")) {
//                List<CocheModelo> cochesEncontrados = DatosParking.busquedaCoches(request.getParameter("matriculaCoche"));
//                /*Se modifica la sesión que se ha creado:
//                Se llama a la sesión con el nombre "buscar" 
//                A esta sesión se le modifica el atributo, enlazándole la lista de coches a consultar*/
//
// /*En este bloque se está reenviando desde el controlador a la vista*/
//                session.setAttribute("buscar", cochesEncontrados);
//                /*Se está haciendo un enlace a /index.jsp*/
//                String url = "/index.jsp";
//                /*Obtiene el contexto del Servlet*/
//                ServletContext sc = getServletContext();
//                /*Se quiere ir a la url /index.jsp*/
//                RequestDispatcher rd = sc.getRequestDispatcher(url);
//                /*Reenvio para que la información viaje y esté actualizada con respecto a lo que se hizo en la sesión*/
//                rd.forward(request, response);
//
//            } else if (accion.equalsIgnoreCase("buscar1")) {
//                List<CocheModelo> cochesAparcados = DatosParking.busquedaCochesAparcados();
//                session.setAttribute("buscarCochesAparcados", cochesAparcados);
//                String url = "/index.jsp";
//                ServletContext sc = getServletContext();
//                RequestDispatcher rd = sc.getRequestDispatcher(url);
//                rd.forward(request, response);
//            
//            }
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
