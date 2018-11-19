<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="js/ValidarUsuario.js"  type="text/javascript"></script>
<title>Agregar un Nuevo Usuario</title>
</head>
<body>
	<form method="POST" action="UsuarioServices" name="ajouter" onsubmit="return validar();">
		<input type="hidden" name="action" value="insert" />
		<table>
                        <caption>Agregar un nuevo Usuario</caption>
			<tr>
                                <td><input type="text" id="id" name="id" placeholder="Id"/></td>
			</tr>
			<tr>
                                <td><input type="password" id="clave" name="nom" placeholder="clave" /></td>
			</tr>
			<tr>
				<td><input type="text" id="tipo" name="prenom"  placeholder="1 para Oferente, 2 Empresa" /></td>
			</tr>
			<tr>
                            <td><input type="submit" value="ajustar" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
    <div class="lien">
    
    <p><a href="ListaPuestos1.jsp" >Atras</a></p>
</div>
</body>
</html>