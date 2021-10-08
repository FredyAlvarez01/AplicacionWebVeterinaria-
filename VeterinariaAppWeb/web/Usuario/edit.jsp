<%-- 
    Document   : edit
    Created on : Oct 5, 2021, 12:26:41 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Editar Usuario</title>
    </head>
    <body>

        <div class="container">
            <h1>Editar Usuario</h1><br>
        
            <form action="UsuarioController?accion=actualizar" method="POST" autocomplete="off">
    
                
                
                 <input type="hidden" name="id" id="id" value="<c:out value="${usuario.id}"/>"/>
                
           
                Nombre: <br>
                <input class="form-control" type="text" id="nombre" name="nombre" value="<c:out value="${usuario.nombre}"/>"/><br><br>
           
                Apelldio: <br>
                <input class="form-control" type="text" id="apellido" name="apellido" value="<c:out value="${usuario.apellido}"/>"/><br><br>
          
                Tipo_Documento: <br>
                <input class="form-control" type="text" id="tipo_documento" name="tipo_documento" value="<c:out value="${usuario.tipo_documento}"/>"/><br><br>
         
                Documento_Identificacion: <br>
                <input class="form-control" type="text" id="documento_identificacion" name="documento_identificacion" value="<c:out value="${usuario.documento_identificacion}"/>"/><br><br>
           
                Estado: <br>
                <select class="form-control" name="estado">
                    <option>Seleccione</option>
                    <option value="Activo">Activo</option>
                    <option value="Inactivo">Inactivo</option>
    
    
                </select><br><br>
              
                Sexo: <br>
                <select class="form-control" name="sexo">
                    <option>Seleccione</option>
                    <option value="Masculino">Masculino</option>
                    <option value="Femenino">Femenino</option>
    
    
                </select><br><br>
              
                       
            <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
            <a class="btn btn-secondary"  href="/VeterinariaAppWeb/UsuarioController"   > Cancelar</a>
    
        </form>
        </div>
        
        
        
    </body>
</html>
