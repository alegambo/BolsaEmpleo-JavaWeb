/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
  var id,Nombre,Localizacion,Correo,Telefono,Descripcion,expresion;
  Nombre=document.getElementById("Nombre").value;
   id=document.getElementById("id").value;
   Localizacion=document.getElementById("Localizacion").value;
   Correo=document.getElementById("Correo").value;
   Telefono=document.getElementById("Telefono").value;
   Descripcion=document.getElementById("Descripcion").value;
   
   if(Nombre===""|| id==="" || Localizacion==="" || Correo==="" || Telefono==="" || Descripcion===""){
       alert("Todos los campos son obligatorios");
       return false;
   } else if(Nombre.length>45||Localizacion.length>45){
       alert("Todos los campos deben ser de menos de 45 caracteres");
       return false;
   } else if(isNaN(Telefono)){
       alert("El telefono ingresado no es un numero");
       return false;
   }
   else if(isNaN(id)){
       alert("La cedula no es valida, deben ser solo numeros");
       return false;
   }
    alert("Datos agregados");
}


