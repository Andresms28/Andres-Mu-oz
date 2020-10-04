/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarrega.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
@WebServlet(name = "Reservas", urlPatterns = {"/Reservas"})
public class Reservas extends HttpServlet {

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
            out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Start Page</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <form method=\"post\" action=\"Reservas\" >\n" +
"            <div id=\"container\">\n" +
"                <div class=\"div1\">\n" +
"                    <fieldset>\n" +
"                        <legend>Datos del cliente</legend>\n" +
"                        <p>Usuario: <input type=\"text\" name=\"Usuario\" ></p>\n" +
"                        <p>Contraseña : <input type=\"password\" name=\"Contrasena\" ></p>\n" +
"                        <p>Telefono : <input type=\"tel\" name=\"Telefono\" ></p>\n" +
"                        <p>e-Mail : <input type=\"email\" name=\"eMail\" ></p>\n" +
"                        <p>NumeroNoches : <input type=\"number\" name=\"NumeroNoches\" ></p>\n" +
"                    </fieldset>\n" +
"                </div>\n" +
"\n" +
"                <div class=\"div2\">\n" +
"                    <fieldset>\n" +
"                        <legend>Datos de la estancia</legend>\n" +
"                        <p>Dias: \n" +
"                            <select name=\"Dias\" >\n" +
"                                <option selected=\"selected\">-1- </option>\n" +
"                                <option>-2-</option>\n" +
"                                <option>-3-</option>\n" +
"                                <option>-4-</option>\n" +
"                                <option>-5-</option>\n" +
"                                <option>-6-</option>\n" +
"                                <option>-7-</option>\n" +
"                                <option>-8-</option>\n" +
"                                <option>-9-</option>\n" +
"                                <option>-10-</option>\n" +
"                                <option>-11-</option>\n" +
"                                <option>-12-</option>\n" +
"                                <option>-13-</option>\n" +
"                                <option>-14-</option>\n" +
"                                <option>-15-</option>\n" +
"                                <option>-16-</option>\n" +
"                                <option>-17-</option>\n" +
"                                <option>-18-</option>\n" +
"                                <option>-19-</option>\n" +
"                                <option>-20-</option>\n" +
"                                <option>-21-</option>\n" +
"                                <option>-22-</option>\n" +
"                                <option>-23-</option>\n" +
"                                <option>-24-</option>\n" +
"                                <option>-25-</option>\n" +
"                                <option>-26-</option>\n" +
"                                <option>-27-</option>\n" +
"                                <option>-28-</option>\n" +
"                                <option>-29-</option>\n" +
"                                <option>-30-</option>\n" +
"                                <option>-31-</option>\n" +
"\n" +
"                            </select>\n" +
"                            Mes:                    \n" +
"                            <select name=\"Mes\" > \n" +
"                                <option value=\"01\" selected=\"selected\">Enero</option> \n" +
"                                <option value=\"02\">Febrero</option> \n" +
"                                <option value=\"03\">Marzo</option> \n" +
"                                <option value=\"04\">Abril</option> \n" +
"                                <option value=\"05\">Mayo</option> \n" +
"                                <option value=\"06\">Junio</option> \n" +
"                                <option value=\"07\">Julio</option> \n" +
"                                <option value=\"08\">Agosto</option> \n" +
"                                <option value=\"09\">Septiembre</option> \n" +
"                                <option value=\"10\">Octubre</option> \n" +
"                                <option value=\"11\">Noviembre</option> \n" +
"                                <option value=\"12\">Diciembre</option> \n" +
"                            </select><img src=\"pic_trulli.jpg\" alt=\"\"></p>\n" +
"                        <p>Tipo de habitación: \n" +
"                            <input type=\"radio\" name=\"Habitacion\" value=\"Simple\" checked=\"checked\"> Simnple\n" +
"                            <input type=\"radio\" name=\"Habitacion\" value=\"Doble\"> Doble\n" +
"                            <input type=\"radio\" name=\"Habitacion\" value=\"Doble\"> Matrimonio</p>\n" +
"                        <p>Extras : </p>\n" +
"                        <p><input type=\"checkbox\" name=\"Extras\" value=\"Desayuno\" >Desayuno<input type=\"checkbox\" name=\"Extras\" value=\"Comida\" >Comida</p>\n" +
"                        <p><input type=\"checkbox\" name=\"Extras\" value=\"Cena\" >Cena<input type=\"checkbox\" name=\"Extras\" value=\"Cama Supletoria\" >Cama Supletoria</p>\n" +
"\n" +
"                    </fieldset>\n" +
"                </div>\n" +
"\n" +
"                <div class=\"div3\">\n" +
"                    <fieldset>\n" +
"                        <legend>Comentario </legend>\n" +
"                        <p><textarea name=\"Comentario\" rows=\"5\" cols=\"50\" placeholder=\"Escriba aquí...\"  ></textarea></p>\n" +
"                    </fieldset>\n" +
"                </div>\n" +
"                <div class=\"div4\">\n" +
"                    <input type=\"submit\" value=\"Enviar\">\n" +
"                    <input type=\"reset\" value=\"Borrar\">\n" +
"                </div>\n" +
"\n" +
"            </div>\n" +
"        </form>\n" +
"    </body>\n" +
"</html>\n" +
"");
            
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
