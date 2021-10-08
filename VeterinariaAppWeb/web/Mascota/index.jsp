<%-- 
    Document   : index
    Created on : Oct 6, 2021, 10:55:19 PM
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
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Veterinaria</title>
    </head>
    <body>
        
        
    <div class="container" ><a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/UsuarioController"   >Usuario</a>

    <a class="btnNuevoUsuario"  href="#" >Mascota </a>
    
    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/HistoriaClinicaController" >Historia Clinica </a>
    
    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/DetalleController" >Detalle Historia Clinica </a>
    
    <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/ColaboradorController" >Colaborador </a>
    
    <a class="btn btn-warning"  href="/VeterinariaAppWeb" >Sali</a>
    
    
    </div>


       
        
        <div class="container" >
             <h3>Listado de mascotas</h3>
<table class="table table-striped table-bordered table-hover">

    <thead>
        <tr>
            <th>ID</th>
            <th>NOMBRE</th>
            <Th>RAZA</Th>
            <Th>USUARIO ID</Th>
            <th>SEXO</th>
            <th>MODIFICAR</th>
            <th>ELIMINAR</th>
           
        </tr>
    </thead>
   <tbody>
        
        <c:forEach var="mascota" items="${lista}" >
            
            <tr>
                
                <td><c:out value="${mascota.id}"/></td>
                <td><c:out value="${mascota.nombre}"/></td>
                <td><c:out value="${mascota.raza}"/></td>
                <td><c:out value="${mascota.usuario_id}"/></td>
                <td><c:out value="${mascota.sexo}"/></td>
                <td> <a class="btn btn-primary" href="MascotaController?accion=edit&id=<c:out value="${mascota.id}"/>"> Modificar</a> </td>
                <td> <a class="btn btn-danger" href="MascotaController?accion=eliminar&id=<c:out value="${mascota.id}"/>">Eliminar</a> </td>
                
            </tr>
            
        </c:forEach>
        
        
    </tbody> 

</table>
        <div ><a class="btn btn-success" href="MascotaController?accion=add">Registrar Mascota</a><br><br></div>
        
        </div>
</body>
</html>
