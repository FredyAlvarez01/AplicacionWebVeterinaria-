<%-- 
    Document   : edit
    Created on : Oct 7, 2021, 12:24:38 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Veterinaria</title>
    </head>
    <body>


       <div class="container">
        <br><br>
        <h1>Editar hitoria clinica</h1><br>
        
        <form action="HistoriaClinicaController?accion=actualizar" method="POST" autocomplete="off">

                
            
             <input type="hidden" name="id" id="id" value="<c:out value="${hclinico.id}"/>"/>
            
        
            Mascota id: <br>
            <input class="form-control" type="text" id="mascota_id" name="mascota_id" value="<c:out value="${hclinico.mascota_id}"/>"/><br><br>
        
            fecha creacion: <br>
            <input class="form-control" type="text" id="fecha_creacion" name="fecha_creacion" value="<c:out value="${hclinico.fecha_creacion}"/>"/><br><br>
        
        
         
        
        <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
        <a class="btn btn-secondary"  href="/VeterinariaAppWeb/HistoriaClinicaController" >Cancelar </a>

    </form>

       </div>
        
        
    </body>
</html>
