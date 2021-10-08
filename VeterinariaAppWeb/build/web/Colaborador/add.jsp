<%-- 
    Document   : add
    Created on : Oct 7, 2021, 11:53:50 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1>Registrar Colaborador</h1><br><br>
    
            <form action="ColaboradorController?accion=insertar" method="POST" autocomplete="off">
        
                
                    Nombre: <br>
                    <input class="form-control" type="text" id="nombre" name="nombre"/><br>
                
                    Apellidio: <br>
                    <input class="form-control" type="text" id="apellido" name="apellido"/><br>
               
                    Cargo: <br>
                    <input class="form-control" type="text" id="cargo" name="cargo"/><br>
              
                    Especialidad: <br>
                    <input class="form-control" type="text" id="especialidad" name="especialidad"/><br>
                              
              
                    Tipo Documento: <br>
                    <input class="form-control" type="text" id="tipo_documento" name="tipo_documento"/><br>
                
                    Documento Identificacion: <br>
                    <input class="form-control" type="text" id="documento_identificacion" name="documento_identificacion"/><br><br>
                
                
                <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
                <a class="btn btn-secondary"  href="/VeterinariaAppWeb/ColaboradorController" >Cancelar </a>
        
            </form>

        </div>
        
    
    </body>
</html>