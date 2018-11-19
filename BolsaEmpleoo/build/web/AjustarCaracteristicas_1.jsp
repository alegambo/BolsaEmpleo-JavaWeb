<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/ValidarCaracteristicas.js"  type="text/javascript"></script>
<title>Ajustar una Nueva Caracteristica</title>
</head>
<body>
	<form method="POST" action="CaracteristicaServices1" name="ajouter" onsubmit="return validar();">
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Ajustar una nueva Caracteristica</caption>
			<tr>
                                <td><input id="id" type="text" name="id" placeholder="id"/></td>
			</tr>
			<tr>
                                <td><input id="Nombre" type="text" name="Nombre" placeholder="nombre de la Caracteristica" /></td>
			</tr>
                        <tr>
                                <td><input id="Nivel" type="text" name="Nivel" placeholder="Nivel" /></td>
			</tr>
                        <tr>
                                <td><input id="Lenguaje1" type="text" name="Lenguaje1" placeholder="Lenguaje1" /></td>
		</tr>
                    <tr>
                                <td><input id="Lenguaje2" type="text" name="Lenguaje2" placeholder="Lenguaje2" /></td>
		</tr>
                    <tr>
                                <td><input id="Lenguaje3" type="text" name="Lenguaje3" placeholder="Lenguaje3" /></td>
		</tr>
                    <tr>
                                <td><input id="Tecnologia1" type="text" name="Tecnologia1" placeholder="Tecnologia1" /></td>
		</tr>
                 <tr>
                                <td><input id="Tecnologia2" type="text" name="Tecnologia2" placeholder="Tecnologia2" /></td>
		</tr>
                 <tr>
                                <td><input id="Tecnologia3" type="text" name="Tecnologia3" placeholder="Tecnologia3" /></td>
		</tr>
                        
                        
			
			<tr>
                            <td><input type="submit" value="ajustar" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
</body>
</html>