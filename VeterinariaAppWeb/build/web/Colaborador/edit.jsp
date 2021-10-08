<%-- 
    Document   : edit
    Created on : Oct 7, 2021, 11:54:02 PM
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
            <h1>Editar Colaborador</h1><br>
              
        
            <form action="ColaboradorController?accion=actualizar" method="POST" autocomplete="off">
    
                
                
                 <input class="form-control" type="hidden" name="id" id="id" value="<c:out value="${colaborador.id}"/>"/>
          
                Nombre: <br>
                <input class="form-control" type="text" id="nombre" name="nombre" value="<c:out value="${colaborador.nombre}"/>"/><br>
          
                Apelldio: <br>
                <input class="form-control" type="text" id="apellido" name="apellido" value="<c:out value="${colaborador.apellido}"/>"/><br>
            
                Cargo: <br>
                <input class="form-control" type="text" id="cargo" name="cargo" value="<c:out value="${colaborador.cargo}"/>"/><br>
           
                Especialidad: <br>
                <input class="form-control" type="text" id="especialidad" name="especialidad" value="<c:out value="${colaborador.especialidad}"/>"/><br>
                          
            
                Tipo_Documento: <br>
                <input class="form-control" type="text" id="tipo_documento" name="tipo_documento" value="<c:out value="${colaborador.tipo_documento}"/>"/><br>
           
                Documento_Identificacion: <br>
                <input class="form-control" type="text" id="documento_identificacion" name="documento_identificacion" value="<c:out value="${colaborador.documento_identificacion}"/>"/><br><br>
         
            <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
            <a class="btn btn-secondary"  href="/VeterinariaAppWeb/ColaboradorController" >Cancelar </a>
    
        </form>


        </div>
        
        
    </body>
</html>