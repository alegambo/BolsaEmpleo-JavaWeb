<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/ValidarPuesto.js" type="text/javascript"></script>
<title>Ajustar Puestos</title>
</head>
<body>
	<form method="POST" action="PuestoServices1" name="ajouter" onsubmit="return validar();">
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Ajustar un nuevo Puesto</caption>
			<tr>
                                <td><input type="text" id="id" name="id" placeholder="identificacion del puesto"/></td>
			</tr>
			<tr>
                                <td><input type="text" id="NombrePuesto" name="NombrePuesto" placeholder="nombre del Puesto" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Salario" name="Salario" placeholder="Salario Ofrecido" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Tipo" name="Tipo" placeholder="Tipo" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Empresa_id" name="Empresa_id" placeholder="Cedula Juridica de la Empresa Ofrecida" /></td>
			</tr>
                        
                        
			
			<tr>
                            <td><input type="submit" value="ajustar" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
</body>
</html>