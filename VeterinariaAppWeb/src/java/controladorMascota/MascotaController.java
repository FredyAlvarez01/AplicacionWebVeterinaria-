/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorMascota;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloMascota.Mascota;
import modeloMascota.MascotaDAO;


@WebServlet(name = "MascotaController", urlPatterns = {"/MascotaController"})
public class MascotaController extends HttpServlet {

       
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        MascotaDAO mascotaDAO =new MascotaDAO();
        String accion;
        RequestDispatcher dispatcher =null;
        
        accion =request.getParameter("accion");
        
        if(accion==null || accion.isEmpty()){
        
        dispatcher=request.getRequestDispatcher("Mascota/index.jsp");
        List<Mascota>listaMascota=mascotaDAO.listarMascota();
        request.setAttribute("lista", listaMascota);
        
        
        }else if("add".equals(accion)){
        dispatcher=request.getRequestDispatcher("Mascota/add.jsp");
        
        }else if("insertar".equals(accion)){
            
            int id= Integer.parseInt(request.getParameter("id"));
            String nombre= request.getParameter("nombre");
            String raza= request.getParameter("raza");
            
            int usuario_id= Integer.parseInt( request.getParameter("usuario_id"));
            
            String sexo= request.getParameter("sexo");
            
            Mascota mascota=new Mascota(id, nombre, raza, usuario_id, sexo);
            mascotaDAO.insertar(mascota);
            dispatcher=request.getRequestDispatcher("Mascota/index.jsp");
            List<Mascota>listaMascota=mascotaDAO.listarMascota();
            request.setAttribute("lista", listaMascota);
            
        }else if("edit".equals(accion)){
            dispatcher=request.getRequestDispatcher("Mascota/edit.jsp");
            int id=Integer.parseInt(request.getParameter("id"));
            
            Mascota mascota= mascotaDAO.mostrarMascota(id);
            request.setAttribute("mascota", mascota);
        
        }else if("actualizar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            String nombre= request.getParameter("nombre");
            String raza= request.getParameter("raza");
            
            int usuario_id= Integer.parseInt( request.getParameter("usuario_id"));
           
            String sexo= request.getParameter("sexo");
            
            Mascota mascota=new Mascota(id, nombre, raza, usuario_id, sexo);
            mascotaDAO.actualizar(mascota);
            dispatcher=request.getRequestDispatcher("Mascota/index.jsp");
            List<Mascota>listaMascota=mascotaDAO.listarMascota();
            request.setAttribute("lista", listaMascota);
            
            
        }else if("eliminar".equals(accion)){
            
            int id=Integer.parseInt(request.getParameter("id"));
            
            mascotaDAO.eliminar(id);
            dispatcher=request.getRequestDispatcher("Mascota/index.jsp");
            List<Mascota>listaMascota=mascotaDAO.listarMascota();
            request.setAttribute("lista", listaMascota);
        }else{
            dispatcher=request.getRequestDispatcher("Mascota/index.jsp");
            List<Mascota>listaMascota=mascotaDAO.listarMascota();
            request.setAttribute("lista", listaMascota);
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
