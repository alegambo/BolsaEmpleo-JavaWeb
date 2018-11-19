<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/ValidarEmpresas_has_Caracteristicas.js"  type="text/javascript"></script>
<title>Asociar la Caracteristica Creada</title>
</head>
<body>
	<form method="POST" action="Empresa_has_CaracteristicaServices" name="ajouter" onsubmit="return validar();">
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Asociar la Caracteristica Creada</caption>
			<tr>
                                <td><input type="text" id=Caracteristicas_id" name="Caracteristicas_id" placeholder="Caracteristicas_id"/></td>
			</tr>
			<tr>
                                <td><input type="text" id="nivel" name="nivel" placeholder="nivel" /></td>
			</tr>
                        <tr>
                                <td><input type="text" id="Puesto_id" name="Puesto_id" placeholder="Id del Puesto referido" /></td>
			</tr>
                     
               
                        
                        
			
			<tr>
                            <td><input type="submit" value="ajustar" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
</body>
</html>