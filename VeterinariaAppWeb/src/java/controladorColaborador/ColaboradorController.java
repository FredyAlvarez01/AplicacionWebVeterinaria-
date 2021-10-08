/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorColaborador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloColaborador.Colaborador;
import modeloColaborador.ColaboradorDAO;

@WebServlet(name = "ColaboradorController", urlPatterns = {"/ColaboradorController"})
public class ColaboradorController extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ColaboradorDAO colaboradorDAO =new ColaboradorDAO();
        String accion;
        RequestDispatcher dispatcher =null;
        
        accion =request.getParameter("accion");
        
        if(accion==null || accion.isEmpty()){
        
        dispatcher=request.getRequestDispatcher("Colaborador/index.jsp");
        List<Colaborador>listaColaborador=colaboradorDAO.listarColaborador();
        request.setAttribute("lista", listaColaborador);
        
        
        }else if("add".equals(accion)){
        dispatcher=request.getRequestDispatcher("Colaborador/add.jsp");
        
        }else if("insertar".equals(accion)){
            
            String nombre= request.getParameter("nombre");
            String apellido= request.getParameter("apellido");
            String cargo= request.getParameter("cargo");
            String especialidad= request.getParameter("especialidad");
            String tipo_documento= request.getParameter("tipo_documento");
            int documento_identificacion= Integer.parseInt( request.getParameter("documento_identificacion"));
            
            
            Colaborador colaborador=new Colaborador(0, nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion);
            colaboradorDAO.insertar(colaborador);
            dispatcher=request.getRequestDispatcher("Colaborador/index.jsp");
            List<Colaborador>listaColaborador=colaboradorDAO.listarColaborador();
            request.setAttribute("lista", listaColaborador);
            
        }else if("edit".equals(accion)){
            dispatcher=request.getRequestDispatcher("Colaborador/edit.jsp");
            int id=Integer.parseInt(request.getParameter("id"));
            
            Colaborador colaborador= colaboradorDAO.mostrarColaborador(id);
            request.setAttribute("colaborador", colaborador);
        
        }else if("actualizar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            String nombre= request.getParameter("nombre");
            String apellido= request.getParameter("apellido");
            String cargo= request.getParameter("cargo");
            String especialidad= request.getParameter("especialidad");
            String tipo_documento= request.getParameter("tipo_documento");
            int documento_identificacion= Integer.parseInt( request.getParameter("documento_identificacion"));
            
            Colaborador colaborador=new Colaborador(id, nombre, apellido, cargo,  especialidad,  tipo_documento,  documento_identificacion);
            colaboradorDAO.actualizar(colaborador);
            dispatcher=request.getRequestDispatcher("Colaborador/index.jsp");
            List<Colaborador>listaColaborador=colaboradorDAO.listarColaborador();
            request.setAttribute("lista", listaColaborador);
            
            
        }else if("eliminar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            
            colaboradorDAO.eliminar(id);
            dispatcher=request.getRequestDispatcher("Colaborador/index.jsp");
            List<Colaborador>listaColaborador=colaboradorDAO.listarColaborador();
            request.setAttribute("lista", listaColaborador);
        }else{
            dispatcher=request.getRequestDispatcher("Colaborador/index.jsp");
            List<Colaborador>listaColaborador=colaboradorDAO.listarColaborador();
            request.setAttribute("lista", listaColaborador);
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
