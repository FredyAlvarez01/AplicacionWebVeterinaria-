<%-- 
    Document   : edit
    Created on : Oct 7, 2021, 10:22:22 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    
    
    <body>


        <div class="container">
            <br><br>
            <h1>Editar Detalle Hitoria Clinica</h1><br>
        
 <!--            id, temperatura,  peso, frecuencia_cardiaca,  frecuencia_respiratoria,  fecha_hora,   alimentacion,  habitad, observacion,  colaborador_id,  historia_clinica_id-->
    
        
        <form action="DetalleController?accion=actualizar" method="POST" autocomplete="off">

            
            
             <input type="hidden" name="id" id="id" value="<c:out value="${detalle.id}"/>"/>
           
            Temperatura <br>
            <input class="form-control" type="text" id="temperatura" name="temperatura" value="<c:out value="${detalle.temperatura}"/>"/> <br>
        
            Peso: <br>                                                                                                  
            <input class="form-control" type="text" id="peso" name="peso" value="<c:out value="${detalle.peso}"/>"/><br>                                                

            Frecuencia_cardiaca <br>
            <input class="form-control" type="text" id="frecuencia_cardiaca" name="frecuencia_cardiaca" value="<c:out value="${detalle.frecuencia_cardiaca}"/>"/><br>
        
            
            Frecuencia respiratoria <br>
            <input class="form-control" type="text" id="frecuencia_respiratoria" name="frecuencia_respiratoria" value="<c:out value="${detalle.frecuencia_respiratoria}"/>"/><br>
       
            Fecha hora: <br>
            <input class="form-control" type="text" id="fecha_hora" name="fecha_hora" value="<c:out value="${detalle.fecha_hora}"/>"/><br>
        
            Alimentacion: <br>
            <input class="form-control" type="text" id="alimentacion" name="alimentacion" value="<c:out value="${detalle.alimentacion}"/>"/><br>
       
            Habitad <br>
            <input class="form-control" type="text" id="habitad" name="habitad" value="<c:out value="${detalle.habitad}"/>"/><br>
       
            Observacion <br>
            <input class="form-control" type="text" id="observacion" name="observacion" value="<c:out value="${detalle.observacion}"/>"/><br>
            
       
            Colaborador id <br>
            <input class="form-control" type="text" id="colaborador_id" name="colaborador_id" value="<c:out value="${detalle.colaborador_id}"/>"/><br>
        
            Historia clinica id: <br>
            <input class="form-control" type="text" id="historia_clinica_id" name="historia_clinica_id" value="<c:out value="${detalle.historia_clinica_id}"/>"/><br><br>
        
            <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
            <a class="btn btn-secondary"  href="/VeterinariaAppWeb/DetalleController" >Cancelar </a>

         </form>

        </div>
        
        
    </body>
</html>
