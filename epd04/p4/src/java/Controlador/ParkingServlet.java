/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CocheModelo;
import Modelo.persistencia.DatosParking;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author susana
 */
public class ParkingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ParseException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession(false); //Para crear la sesión, siempre inicializamos a false
        List<CocheModelo> coches = DatosParking.cochesZonaAzul();

        if (session != null) {
            String accion = request.getParameter("accion");
            

            if (accion.equalsIgnoreCase("insertar")) {
                String matricula=request.getParameter("matricula");
                String modelo=request.getParameter("modelo");
                
                String horaentrada=(request.getParameter("horaE"));

                DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                Time hora_entrada = new Time(formatter.parse(horaentrada).getTime());

                
                String horasalida=(request.getParameter("horaS"));
                Time hora_salida = new Time(formatter.parse(horasalida).getTime());
                
                int tiempoMax=(Integer.parseInt(request.getParameter("tiempoMax")));
       
               DatosParking.insertarCoche(matricula,modelo,hora_entrada,hora_salida,tiempoMax);
                
           
            }else if(accion.equalsIgnoreCase("eliminar")){
                String matricula =request.getParameter("matricula");
                
                DatosParking.eliminarCoche(matricula);
               
                
            }else if(accion.equalsIgnoreCase("editar")){
                 String matricula=request.getParameter("matricula");
                //recogida de nuevos datos
                String matriculaActual=request.getParameter("matriculaActual");
                String modelo=request.getParameter("modelo");
                
                String horaentrada=(request.getParameter("horaE"));

                DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                Time hora_entrada = new Time(formatter.parse(horaentrada).getTime());

                
                String horasalida=(request.getParameter("horaS"));
                Time hora_salida = new Time(formatter.parse(horasalida).getTime());
                
                int tiempoMax=(Integer.parseInt(request.getParameter("tiempoMax")));
                
                DatosParking.editarCoche(matricula, matriculaActual, modelo, hora_entrada, hora_salida, tiempoMax);
            }
            List<CocheModelo> updateViews = DatosParking.cochesZonaAzul();
                 request.setAttribute("coches", updateViews);
                String url = "/index.jsp";
                 
                ServletContext sc = getServletContext();
                RequestDispatcher rd = sc.getRequestDispatcher(url);
                rd.forward(request, response);
          
            
        } else {
            request.setAttribute("coches", coches);
            String url = "/index.jsp";
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(url);
            rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ParkingServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ParkingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ParkingServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ParkingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
