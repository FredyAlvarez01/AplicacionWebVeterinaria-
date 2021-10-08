<%-- 
    Document   : index
    Created on : Oct 7, 2021, 10:22:35 PM
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
    
        <a class="btnNuevoUsuario"  href="#" >Detalle Historia Clinica </a>
    
        <a class="btnNuevoUsuario"  href="/VeterinariaAppWeb/ColaboradorController" >Colaborador </a>
        
        <a class="btn btn-warning"  href="/VeterinariaAppWeb" >Sali</a>
    
    
    </div>
        
        
        <div class="container-fluid" >   
        <h3>Detalle historia clinica</h3>
        
      

    <table class="table table-striped table-bordered table-hover table-condensed">

        <thead>
            <tr>
                <th>ID</th>
                <th>TEMPERATURA</th>
                <Th>PESO</Th>
                <Th>FRECUENCIA CARDIACA</Th>
                <th>FRECUENCIA RESPIRATORIA</th>
                <th>FECHA HORA</th>
                <th>ALIMENTACION</th>
                <th>HABITA</th>
                <th>OBSERVACION</th>
                <th>COLABORADOR ID</th>
                <th>HISTORIA CLINICA ID</th>
                <th>MODIFICAR</th>
                <th>ELIMINAR</th>
           
            </tr>
        </thead>
        <tbody>
        
            <c:forEach var="detalle" items="${lista}" >
            
<!--            id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,   alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id-->
            
            <tr>
                
                <td><c:out value="${detalle.id}"/></td>
                <td><c:out value="${detalle.temperatura}"/></td>
                <td><c:out value="${detalle.peso}"/></td>
                <td><c:out value="${detalle.frecuencia_cardiaca}"/></td>
                <td><c:out value="${detalle.frecuencia_respiratoria}"/></td>
                <td><c:out value="${detalle.fecha_hora}"/></td>
                <td><c:out value="${detalle.alimentacion}"/></td>
                <td><c:out value="${detalle.habitad}"/></td>
                <td><c:out value="${detalle.observacion}"/></td>
                <td><c:out value="${detalle.colaborador_id}"/></td>
                <td><c:out value="${detalle.historia_clinica_id}"/></td>
                <td> <a class="btn btn-primary" href="DetalleController?accion=edit&id=<c:out value="${detalle.id}"/>"> Modificar</a> </td>
                <td> <a class="btn btn-danger" href="DetalleController?accion=eliminar&id=<c:out value="${detalle.id}"/>">Eliminar</a> </td>
                
            </tr>
            
            </c:forEach>
        
        
        </tbody> 

    </table>

    <div ><a class="btn btn-success" href="DetalleController?accion=add">Registro detalle historia Clinica</a><br><br></div>
    </div>     
    </body>
</html>