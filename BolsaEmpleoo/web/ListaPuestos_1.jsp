<%@page import="bolsa.model.Puesto"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="bolsa.model.Puesto" %>
<%@ page import="bolsa.model.PuestoModel" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <script src="js/BuscadorTabla.js"  type="text/javascript"></script>
<title>Lista de Puestos Disponibles Inscritos en el Sistema</title>
</head>
<body>
     <label>Buscar Puesto:</label>
     <input id="searchTerm" type="text" onkeyup="doSearch()"/>
     <h1>Bienvenidos a la Bolsa de Empleo</h1>
     <h3>Ultimas oferta de Puestos en Empresas</h3>
     
     
<%
	PuestoModel dao = new PuestoModel();
	List<Puesto> userList = dao.getAllUsers();
	Iterator<Puesto> itr = userList.iterator();
        Puesto utilisateur = null;
%>
<marquee scrolldelay="100"><table id="datos" class="table">
    <caption>Lista de Puestos</caption>
	<tr>
		<th>Cedula Juridica de la Empresa Oferente</th>
		<th>Nombre del puesto</th>
		<th>Salario Ofrecido</th>
                
                <th>id del Puesto</th>
		
	</tr>
	<tr>
		<% //avec la boucle while
		//	while(itr.hasNext()){
		//		userBean user = new userBean();
		//		System.out.println(user.getID());
                //while(utilisateur.getTipo()=="Publico"){
		while(itr.hasNext()) {
                    utilisateur = itr.next();
		%>
			<td><%= utilisateur.getEmpresa_id()  %></td>
			<td><%= utilisateur.getNombrePuesto()  %></td>
                        <td><%= utilisateur.getSalario()  %></td>
                        <td><%= utilisateur.getID()  %></td>
			
			
		</tr>
		<%
			}
//}
		%>	
</table></marquee>
<div class="lien">
    
    <p><a href="AjustarUsuarios_1.jsp" >Desea Registrarse?</a></p>
</div>
</body>
</html>














