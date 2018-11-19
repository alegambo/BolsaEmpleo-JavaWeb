/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
  var id,Nombre,Direccion,Correo,Telefono,Nacionalidad,Apellido;
  Nombre=document.getElementById("Nombre").value;
   id=document.getElementById("id").value;
   Direccion=document.getElementById("Direccion").value;
   Correo=document.getElementById("Correo").value;
   Telefono=document.getElementById("Telefono").value;
   Nacionalidad=document.getElementById("Nacionalidad").value;
   Apellido=document.getElementById("Apellido").value;
   
   
   if(Nombre===""|| id==="" || Direccion==="" || Correo==="" || Telefono==="" || Nacionalidad==="" || Apellido===""){
       alert("Todos los campos son obligatorios");
       return false;
   }  else if(isNaN(Telefono)){
       alert("El telefono ingresado no es un numero");
       return false;
   }
   else if(isNaN(id)){
       alert("La cedula no es valida, deben ser solo numeros");
       return false;
   }
    alert("Datos agregados");
}

