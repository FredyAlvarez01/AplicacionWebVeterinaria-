/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorHistoriaClinica;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloHistoriaClinica.HistoriaClinica;
import modeloHistoriaClinica.HistoriaClinicaDAO;

/**
 *
 * @author usuario
 */
@WebServlet(name = "HistoriaClinicaController", urlPatterns = {"/HistoriaClinicaController"})
public class HistoriaClinicaController extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HistoriaClinicaDAO historiaClinicaDAO =new HistoriaClinicaDAO();
        String accion;
        RequestDispatcher dispatcher =null;
        
        accion =request.getParameter("accion");
        
        if(accion==null || accion.isEmpty()){
        
        dispatcher=request.getRequestDispatcher("HistoriaClinica/index.jsp");
        List<HistoriaClinica>listaHistoriaClinica=historiaClinicaDAO.listarHistoriaClinica();
        request.setAttribute("lista", listaHistoriaClinica);
        
        
        }else if("add".equals(accion)){
        dispatcher=request.getRequestDispatcher("HistoriaClinica/add.jsp");
        
        }else if("insertar".equals(accion)){
            
           
            
            int mascota_id= Integer.parseInt( request.getParameter("mascota_id"));
            int fecha_creacion= Integer.parseInt( request.getParameter("fecha_creacion"));

            
            HistoriaClinica hclinica=new HistoriaClinica(0, mascota_id, fecha_creacion);
            historiaClinicaDAO.insertar(hclinica);
            dispatcher=request.getRequestDispatcher("HistoriaClinica/index.jsp");
            List<HistoriaClinica>listaHistoriaClinica=historiaClinicaDAO.listarHistoriaClinica();
            request.setAttribute("lista", listaHistoriaClinica);
            
         }else if("edit".equals(accion)){
             
            dispatcher=request.getRequestDispatcher("HistoriaClinica/edit.jsp");
            int id=Integer.parseInt(request.getParameter("id"));
            
        
            HistoriaClinica hclinico= historiaClinicaDAO.mostrarHistoriaClinica(id);
            request.setAttribute("hclinico", hclinico);
        
        }else if("actualizar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            int mascota_id= Integer.parseInt( request.getParameter("mascota_id"));
            int fecha_creacion= Integer.parseInt( request.getParameter("fecha_creacion"));
            
            HistoriaClinica hclinico=new HistoriaClinica(id, mascota_id, fecha_creacion);
            
            historiaClinicaDAO.actualizar(hclinico);
            dispatcher=request.getRequestDispatcher("HistoriaClinica/index.jsp");
            List<HistoriaClinica>listaHistoriaClinica=historiaClinicaDAO.listarHistoriaClinica();
            request.setAttribute("lista", listaHistoriaClinica);
            
            
        }else if("eliminar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            
            historiaClinicaDAO.eliminar(id);
            dispatcher=request.getRequestDispatcher("HistoriaClinica/index.jsp");
            List<HistoriaClinica>listaHistoriaClinica=historiaClinicaDAO.listarHistoriaClinica();
            request.setAttribute("lista", listaHistoriaClinica);
        }else{
            dispatcher=request.getRequestDispatcher("HistoriaClinica/index.jsp");
            List<HistoriaClinica>listaHistoriaClinica=historiaClinicaDAO.listarHistoriaClinica();
            request.setAttribute("lista", listaHistoriaClinica);
        }
        
        dispatcher.forward(request, response );
        
        
    }  

  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        doGet(request, response);
       
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
