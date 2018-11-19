<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/ValidarOferente.js"  type="text/javascript"></script>
<title>Ajustar un nuevo Oferente</title>
</head>
<body>
	<form method="POST" action="OferenteServices1"  name="ajouter" onsubmit="return validar();" >
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Ajustar  un nuevo Oferente</caption>
			<tr>
                                <td><input type="text" id="id" name="id" placeholder="Cedula"/></td>
			</tr>
			<tr>
                                <td><input type="text" id="Nombre" name="Nombre" placeholder="Nombre" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Apellido" name="Apellido" placeholder="Apelido" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Nacionalidad" name="Nacionalidad" placeholder="Nacionalidad" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Telefono" name="Telefono" placeholder="Telefono" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Direccion" name="Direccion" placeholder="Direccion" /></td>
			</tr>
                        <tr>
                                <td><input type="email" id="Correo" name="Correo" placeholder="Correo Electronico" /></td>
			</tr>
                       
                        
			
			<tr>
                            <td><input type="submit" value="ajustar" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
</body>
</html>