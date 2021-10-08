<%-- 
    Document   : index
    Created on : Oct 7, 2021, 11:54:10 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="STYLECSS/styleUsuario.css">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
   <body>
              
       <div class="container" >
        
            <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/UsuarioController"  >Usuario</a>

            <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/MascotaController" >Mascota </a>
    
            <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/HistoriaClinicaController" >Historia Clinica </a>
    
            <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/DetalleController" >Detalle Historia Clinica </a>
    
            <a class="btnNuevoUsuario"  href="#" >Colaborador </a>
            
            <a class="btn btn-warning"  href="/VeterinariaAppWeb" >Sali</a>
    
    
        </div>
       
        <div class="container" >
        <h3>Listado colaboradores</h3>
       
    

        <table class="table table-striped table-bordered table-hover">

            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOMBRE</th>
                    <Th>APELLIDO</Th>
                    <th>CARGO</th>
                    <th>ESPECIALIDAD</th>
                    <Th>TIPO DOCUMENTO</Th>
                    <th>DOCUMENTO IDENTIFICACION</th>
                    <th>MODIFICAR</th>
                    <th>ELIMINAR</th>

                </tr>
            </thead>
            <tbody>
        
               
                <c:forEach var="colaborador" items="${lista}" >
            
                    <tr>
                
                        <td><c:out value="${colaborador.id}"/></td>
                        <td><c:out value="${colaborador.nombre}"/></td>
                        <td><c:out value="${colaborador.apellido}"/></td>
                        <td><c:out value="${colaborador.cargo}"/></td>
                        <td><c:out value="${colaborador.especialidad}"/></td>
                        <td><c:out value="${colaborador.tipo_documento}"/></td>
                        <td><c:out value="${colaborador.documento_identificacion}"/></td>
                
                        <td> <a class="btn btn-primary" href="ColaboradorController?accion=edit&id=<c:out value="${colaborador.id}"/>"> Modificar</a> </td>
                        <td> <a class="btn btn-danger" href="ColaboradorController?accion=eliminar&id=<c:out value="${colaborador.id}"/>">Eliminar</a> </td>
                    </tr>
            
                </c:forEach>
        
        
            </tbody>

        </table>
        
        <a class="btn btn-success" href="ColaboradorController?accion=add">Registrar Colaborador</a><br><br>
        
        </div>
    </body>
</html>
