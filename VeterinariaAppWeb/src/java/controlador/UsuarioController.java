/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 *
 * @author usuario
 */
@WebServlet(name = "UsuarioController", urlPatterns = { "/UsuarioController" })
public class UsuarioController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {

            dispatcher = request.getRequestDispatcher("Usuario/index.jsp");
            List<Usuario> listaUsuario = usuarioDAO.listarUsuario();
            request.setAttribute("lista", listaUsuario);

        } else if ("add".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Usuario/add.jsp");

        } else if ("insertar".equals(accion)) {

            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String tipo_documento = request.getParameter("tipo_documento");
            int documento_identificacion = Integer.parseInt(request.getParameter("documento_identificacion"));
            String estado = request.getParameter("estado");
            String sexo = request.getParameter("sexo");

            Usuario usuario = new Usuario(0, nombre, apellido, tipo_documento, documento_identificacion, estado, sexo);

            usuarioDAO.insertar(usuario);
            dispatcher = request.getRequestDispatcher("Usuario/index.jsp");
            List<Usuario> listaUsuario = usuarioDAO.listarUsuario();
            request.setAttribute("lista", listaUsuario);

        } else if ("edit".equals(accion)) {
            dispatcher = request.getRequestDispatcher("Usuario/edit.jsp");
            int id = Integer.parseInt(request.getParameter("id"));

            Usuario usuario = usuarioDAO.mostrarUsuario(id);
            request.setAttribute("usuario", usuario);

        } else if ("actualizar".equals(accion)) {

            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String tipo_documento = request.getParameter("tipo_documento");
            int documento_identificacion = Integer.parseInt(request.getParameter("documento_identificacion"));
            String estado = request.getParameter("estado");
            String sexo = request.getParameter("sexo");

            Usuario usuario = new Usuario(id, nombre, apellido, tipo_documento, documento_identificacion, estado, sexo);
            usuarioDAO.actualizar(usuario);
            dispatcher = request.getRequestDispatcher("Usuario/index.jsp");
            List<Usuario> listaUsuario = usuarioDAO.listarUsuario();
            request.setAttribute("lista", listaUsuario);

        } else if ("eliminar".equals(accion)) {

            int id = Integer.parseInt(request.getParameter("id"));

            usuarioDAO.eliminar(id);
            dispatcher = request.getRequestDispatcher("Usuario/index.jsp");
            List<Usuario> listaUsuario = usuarioDAO.listarUsuario();
            request.setAttribute("lista", listaUsuario);
        } else {
            dispatcher = request.getRequestDispatcher("Usuario/index.jsp");
            List<Usuario> listaUsuario = usuarioDAO.listarUsuario();
            request.setAttribute("lista", listaUsuario);
        }

        dispatcher.forward(request, response);

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
