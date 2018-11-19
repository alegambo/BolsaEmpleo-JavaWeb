<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <script src="js/validarEmpresa.js"  type="text/javascript"></script>
<title>Ajustar una nueva empresa</title>
</head>
<body>
	<form method="POST" action="EmpresaServices" name="ajouter" onsubmit="return validar();">
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Ajustar una nueva empresa</caption>
			<tr>
                                <td><input type="text" id="id" name="id" placeholder="Cedula"/></td>
			</tr>
			<tr>
                                <td><input type="text" id="Nombre" name="Nombre" placeholder="nombre de la Empresa" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Localizacion" name="Localizacion" placeholder="Localizacion" /></td>
			</tr>
                        <tr>
                                <td><input type="email" id="Correo" name="Correo" placeholder="correo" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Telefono" name="Telefono" placeholder="telefono" /></td>
			</tr>
                        <tr>
                                <td><input type="text" rows="4" id="Descripcion" cols="50" name="Descripcion" placeholder="Introduzca la Descripcion de Empresas" /></td>
			</tr>
                        
			
			<tr>
                            <td><input type="submit" value="ajustar" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
</body>
</html>