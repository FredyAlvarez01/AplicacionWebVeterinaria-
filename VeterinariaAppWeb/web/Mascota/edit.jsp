<%-- 
    Document   : adit
    Created on : Oct 6, 2021, 10:55:09 PM
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
            <h1>Editar Usuario</h1><br>
        
        <form action="MascotaController?accion=actualizar" method="POST" autocomplete="off">

            
            
             <input type="hidden" name="id" id="id" value="<c:out value="${mascota.id}"/>"/>
            
       
            Nombre: <br>
            <input class="form-control" type="text" id="nombre" name="nombre" value="<c:out value="${mascota.nombre}"/>"/><br><br>
      
            Raza: <br>
            <input class="form-control" type="text" id="raza" name="raza" value="<c:out value="${mascota.raza}"/>"/><br><br>
       
            Usuario id <br>
            <input class="form-control" type="text" id="usuario_id" name="usuario_id" value="<c:out value="${mascota.usuario_id}"/>"/><br><br>
        
            Sexo: <br>
            <input class="form-control" type="text" id="sexo" name="sexo" value="<c:out value="${mascota.sexo}"/>"/><br><br>
      
                
        
        <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
        <a class="btn btn-secondary"  href="/VeterinariaAppWeb/MascotaController" >Cancelar </a>

        </form>

        </div>
        
        
        
    </body>
</html>