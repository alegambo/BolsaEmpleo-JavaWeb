<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ajouter un nouveau Utilisateur</title>
</head>
<body>
	<form method="POST" action="Caracteristica_has_OferenteServices" name="ajouter" >
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Ajustar una nueva Caracteristica</caption>
			<tr>
                                <td><input type="text" name="Caracteristicas_id" placeholder="Caracteristicas_id"/></td>
			</tr>
			<tr>
                                <td><input type="text" name="Oferente_id" placeholder="id del Oferente" /></td>
			</tr>
                        <tr>
                                <td><input type="text" name="nivel" placeholder="nivel" /></td>
			</tr>
                     
               
                        
                        
			
			<tr>
                            <td><input type="submit" value="ajouter" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
</body>
</html>