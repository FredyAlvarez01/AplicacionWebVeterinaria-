<%-- 
    Document   : index
    Created on : Oct 7, 2021, 12:25:49 PM
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
    
        <a class="btnNuevoUsuario"  href="#" >Historia Clinica </a>
    
        <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/DetalleController" >Detalle Historia Clinica </a>
    
        <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/ColaboradorController" >Colaborador </a>
        
        <a class="btn btn-warning"  href="/VeterinariaAppWeb" >Sali</a>
    
    
    </div>
        
       
    

        <div class="container" >
             <h3>Historia clinica</h3>
<table class="table table-striped table-bordered table-hover">

    <thead>
        <tr>
            <th>ID</th>
            <th>MASCOTA ID</th>
            <Th>FECHA CREACION</Th>
            <th>MODIFICAR</th>
            <th>ELIMINAR</th>

        </tr>
    </thead>
    <tbody>
        
               
        <c:forEach var="hclinico" items="${lista}" >
            
            <tr>
                
                <td><c:out value="${hclinico.id}"/></td>
                <td><c:out value="${hclinico.mascota_id}"/></td>
                <td><c:out value="${hclinico.fecha_creacion}"/></td>
                <td> <a class="btn btn-primary" href="HistoriaClinicaController?accion=edit&id=<c:out value="${hclinico.id}"/>"> Modificar</a> </td>
                <td> <a class="btn btn-danger" href="HistoriaClinicaController?accion=eliminar&id=<c:out value="${hclinico.id}"/>">Eliminar</a> </td>
            </tr>
            
        </c:forEach>
        
        
    </tbody>

</table>
        
<div><a class="btn btn-success" href="HistoriaClinicaController?accion=add">Registro historia clinica</a><br><br></div>
</div>
</body>
</html>