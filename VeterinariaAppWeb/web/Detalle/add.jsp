<%-- 
    Document   : add
    Created on : Oct 7, 2021, 10:22:03 PM
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
            <h1>Registrar historia clinica</h1><br><br>
    
        <form action="DetalleController?accion=insertar" method="POST" autocomplete="off">
        
        
            Id: <br>
            <input class="form-control" type="text" id="id" name="id"/><br>
        
            Temperatura: <br>
            <input class="form-control" type="text" id="temperatura" name="temperatura"/><br>
       
            Peso: <br>
            <input class="form-control" type="text" id="peso" name="peso"/><br>
      
            Frecuencia cardiaca: <br>
            <input class="form-control" type="text" id="frecuencia_cardiaca" name="frecuencia_cardiaca"/><br>
   
            Frecuencia respiratoria: <br>
            <input class="form-control" type="text" id="frecuencia_respiratoria" name="frecuencia_respiratoria"/><br>
      
            Fecha hora: <br>
            <input class="form-control" type="text" id="fecha_hora" name="fecha_hora"/><br>
     
            Alimentacion: <br>
            <input class="form-control" type="text" id="alimentacion" name="alimentacion"/><br>
      
            Habitad: <br>
            <input class="form-control" type="text" id="sexo" name="sexo"/><br>
      
            Observacion: <br>
            <input class="form-control" type="text" id="habitad" name="habitad"/><br>
       
            Colaborador id: <br>
            <input class="form-control" type="text" id="colaborador_id" name="colaborador_id"/><br>
       
            Historia clinica id: <br>
            <input class="form-control" type="text" id="historia_clinica_id" name="historia_clinica_id"/><br><br>
             
        
            <button class="btn btn-success" id="guardar" name="guardar" type="submit" > Guardar</button>
            <a class="btn btn-secondary"  href="/VeterinariaAppWeb/DetalleController" >Cancelar </a>

        </form>

        </div>
    
</body>
</html>