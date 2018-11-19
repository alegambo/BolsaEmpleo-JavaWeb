<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="bolsa.model.Oferente" %>
<%@ page import="bolsa.model.OferenteModel" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>OFerentes</title>
</head>
<body>
<%
	OferenteModel dao = new OferenteModel();
	List<Oferente> userList = dao.getAllUsers();
	Iterator<Oferente> itr = userList.iterator();
        Oferente utilisateur = null;
%>
<table class="table">
    <caption>Lista De Oferentes</caption>
	<tr>
		<th>Id</th>
		<th>Nombre</th>
		<th>Apellido</th>
                <th>Nacionalidad</th>
                <th>Telefono</th>
                <th>Direccion</th>
                <th>Correo</th>
                
		<th>Modificar</th>
		<th>Suprimir</th>
	</tr>
	<tr>
		<% //avec la boucle while
		//	while(itr.hasNext()){
		//		userBean user = new userBean();
		//		System.out.println(user.getID());
		while(itr.hasNext()) {
                    utilisateur = itr.next();
		%>
			<td><%= utilisateur.getID()  %></td>
			<td><%= utilisateur.getNombre()  %></td>
			<td><%= utilisateur.getApellido()%></td>
                        <td><%= utilisateur.getNacionalidad()%></td>
                        <td><%= utilisateur.getTelefono()%></td>
                        <td><%= utilisateur.getDireccion()%></td>
                        <td><%= utilisateur.getCorreo()%></td>
			<td>
                            <form method="POST" action="OferenteServices">
                                <button class="edit"></button>
                                <input type="hidden" name="action" value="editForm" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getID() %>" >
                            </form>
                            
                        </td>
			<td>
                            <form method="POST" action="OferenteServices">
                                <button class="effacer" onclick="if(!confirm('Desea Eliminar ?')) return false;"></button>
                                <input type="hidden" name="action" value="delete" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getID() %>" >
                            </form>
                            
                        </td>
		</tr>
		<%
			}
		%>	
</table>
<div class="lien">
    
    <p><a href="OferenteServices?action=insert" >Ajustar Oferente</a></p>
</div>
</body>
</html>














