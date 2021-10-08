/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDetalle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDetalle.Detalle;
import modeloDetalle.DetalleDAO;

/**
 *
 * @author usuario
 */
@WebServlet(name = "DetalleController", urlPatterns = {"/DetalleController"})
public class DetalleController extends HttpServlet {

        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        DetalleDAO detalleDAO =new DetalleDAO();
        String accion;
        RequestDispatcher dispatcher =null;
        
        accion =request.getParameter("accion");
        
        if(accion==null || accion.isEmpty()){
        
        dispatcher=request.getRequestDispatcher("Detalle/index.jsp");
        List<Detalle>listaDetalle=detalleDAO.listarDetalle();
        request.setAttribute("lista", listaDetalle);
        
        
        }else if("add".equals(accion)){
        dispatcher=request.getRequestDispatcher("Detalle/add.jsp");
        
        }else if("insertar".equals(accion)){
            
            int id= Integer.parseInt(request.getParameter("id"));
            String temperatura= request.getParameter("temperatura");
            double peso=Double.parseDouble( request.getParameter("peso"));
            double frecuencia_cardiaca=Double.parseDouble( request.getParameter("frecuencia_cardiaca"));
            double frecuencia_respiratoria=Double.parseDouble( request.getParameter("frecuencia_respiratoria"));
            //Date fecha_hora= java.sql.Date(getParameter("fecha_hora"));
            
            String alimentacion=request.getParameter("alimentacion");
            String habitad=request.getParameter("habitad");
            String observacion=request.getParameter("observacion");
            
            int colaborador_id= Integer.parseInt(request.getParameter("colaborador_id"));
            int historia_clinica_id= Integer.parseInt(request.getParameter("historia_clinica_id"));
            
            
            
            Detalle detalle=new Detalle(id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  null    ,  alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id);
            detalleDAO.insertar(detalle);
            dispatcher=request.getRequestDispatcher("Detalle/index.jsp");
            List<Detalle>listaDetalle=detalleDAO.listarDetalle();
            request.setAttribute("lista", listaDetalle);
            
        }else if("edit".equals(accion)){
            dispatcher=request.getRequestDispatcher("Detalle/edit.jsp");
            int id=Integer.parseInt(request.getParameter("id"));
            
            Detalle detalle= detalleDAO.mostrarDetalle(id);
            request.setAttribute("detalle", detalle);
        
        }else if("actualizar".equals(accion)){
            
            int id= Integer.parseInt(request.getParameter("id"));
            String temperatura= request.getParameter("temperatura");
            double peso=Double.parseDouble( request.getParameter("peso"));
            double frecuencia_cardiaca=Double.parseDouble( request.getParameter("frecuencia_cardiaca"));
            double frecuencia_respiratoria=Double.parseDouble( request.getParameter("frecuencia_respiratoria"));
            //Date fecha_hora= java.sql.Date(getParameter("fecha_hora"));
            
            String alimentacion=request.getParameter("alimentacion");
            String habitad=request.getParameter("habitad");
            String observacion=request.getParameter("observacion");
            
            int colaborador_id= Integer.parseInt(request.getParameter("colaborador_id"));
            int historia_clinica_id= Integer.parseInt(request.getParameter("historia_clinica_id"));
            
            Detalle detalle=new Detalle(id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  null    ,  alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id);
            detalleDAO.actualizar(detalle);
            dispatcher=request.getRequestDispatcher("Detalle/index.jsp");
            List<Detalle>listaDetalle=detalleDAO.listarDetalle();
            request.setAttribute("lista", listaDetalle);
            
            
        }else if("eliminar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            
            detalleDAO.eliminar(id);
            dispatcher=request.getRequestDispatcher("Detalle/index.jsp");
            List<Detalle>listaDetalle=detalleDAO.listarDetalle();
            request.setAttribute("lista", listaDetalle);
        }else{
            dispatcher=request.getRequestDispatcher("Detalle/index.jsp");
            List<Detalle>listaDetalle=detalleDAO.listarDetalle();
            request.setAttribute("lista", listaDetalle);
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
