<%-- Document : add Created on : Oct 6, 2021, 10:54:59 PM Author : usuario --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
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
                <h1>Ingresar Mascota</h1><br><br>

                <form action="MascotaController?accion=insertar" method="POST" autocomplete="off">



                    ID: <br>
                    <input class="form-control" type="text" id="id" name="id" />

                    Nombre: <br>
                    <input class="form-control" type="text" id="nombre" name="nombre" />

                    Raza: <br>
                    <input class="form-control" type="text" id="raza" name="raza" />
                    Usuario_id: <br>
                    <input class="form-control" type="text" id="usuario_id" name="usuario_id" />

                    Sexo: <br>
                    <input class="form-control" type="text" id="sexo" name="sexo" /><br>



                    <button class="btn btn-success" id="guardar" name="guardar" type="submit"> Guardar</button>
                    <a class="btn btn-secondary"  href="/VeterinariaAppWeb/MascotaController" >Cancelar </a>

                </form>
            </div>


        </body>

        </html>