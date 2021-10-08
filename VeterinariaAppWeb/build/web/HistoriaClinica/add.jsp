<%-- 
    Document   : add
    Created on : Oct 7, 2021, 12:24:28 PM
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
        <h1>Ingresat Mascota</h1><br><br>
    
        <form action="HistoriaClinicaController?accion=insertar" method="POST" autocomplete="off">
            
                Mascota id: <br>
                <input class="form-control" type="text" id="mascota_id" name="mascota_id"/><br>
            
                Fecha creacion: <br>
                <input class="form-control" type="text" id="fecha_creacion" name="fecha_creacion"/><br><br>
          
            <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
            <a class="btn btn-secondary"  href="/VeterinariaAppWeb/HistoriaClinicaController" >Cancelar </a>
    
        </form>
      </div>
    
</body>
</html>