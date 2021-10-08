<%-- Document : add Created on : Oct 5, 2021, 12:26:52 PM Author : usuario --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

                <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
                <title>Veterinaria</title>
            </head>

            <body>



                <div class="container">
                    <br><br>
                    <h2 class="container">Registrar nuevo usuario</h2><br><br>
                    <form action="UsuarioController?accion=insertar" method="POST" autocomplete="off">


                        Nombre: <br>
                        <input class="form-control" type="text" id="nombre" name="nombre" />


                        Apelldio: <br>
                        <input class="form-control" type="text" id="apellido" name="apellido" />


                        Tipo Documento: <br>
                        <input class="form-control" type="text" id="tipo_documento" name="tipo_documento" />

                        Documento Identificacion: <br>
                        <input class="form-control" type="text" id="documento_identificacion"
                            name="documento_identificacion" /><br><br>

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


                        <button class="btn btn-success" id="guardar" name="guardar" type="submit"> Guardar</button>
                        <a class="btn btn-secondary"  href="/VeterinariaAppWeb/UsuarioController"   > Cancelar</a>

                    </form>

                </div>



            </body>

            </html>