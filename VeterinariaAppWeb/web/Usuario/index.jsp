<%-- 
    Document   : index
    Created on : Oct 5, 2021, 12:25:32 PM
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
        <title>Veterinaria</title>
    </head>
<body>
    
    <div class="container"><a class="btnNuevoUsuario"  href="#"  >Usuario</a>

    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/MascotaController" >Mascota </a>
    
    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/HistoriaClinicaController" >Historia Clinica </a>
    
    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/DetalleController" >Detalle Historia Clinica </a>
    
    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/ColaboradorController" >Colaborador </a>

    <a class="btn btn-warning"  href="/VeterinariaAppWeb" >Sali</a>
    
    </div>
    
    <div class="container">

    <h3>Listado de usuarios</h3>
    
<table class="table table-striped table-bordered table-hover">

    <thead>
        <tr>
            <th>ID</th>
            <th>NOMBRE</th>
            <Th>APELLIDO</Th>
            <Th>TIPO DOCUMENTO</Th>
            <th>DOCUMENTO IDENTIFICACION</th>
            <th>ESTADO</th>
            <th>SEXO</th>
            <th>MODIFICAR</th>
            <th>ELIMINAR</th>

        </tr>
    </thead>
    <tbody>
        
               
        <c:forEach var="usuario" items="${lista}" >
            
            <tr>
                
                <td><c:out value="${usuario.id}"/></td>
                <td><c:out value="${usuario.nombre}"/></td>
                <td><c:out value="${usuario.apellido}"/></td>
                <td><c:out value="${usuario.tipo_documento}"/></td>
                <td><c:out value="${usuario.documento_identificacion}"/></td>
                <td><c:out value="${usuario.estado}"/></td>
                <td><c:out value="${usuario.sexo}"/></td>
                <td> <a class="btn btn-primary" href="UsuarioController?accion=edit&id=<c:out value="${usuario.id}"/>"> Modificar</a> </td>
                 <td> <a class="btn btn-danger" href="UsuarioController?accion=eliminar&id=<c:out value="${usuario.id}"/>">Eliminar</a> </td>
            </tr>
            
             
            
        </c:forEach>
        
        
    </tbody>

</table>
<div ><a class="btn btn-success" href="UsuarioController?accion=add">Registrar Usuario</a><br><br></div>
</div>
    

</body>
</html>
