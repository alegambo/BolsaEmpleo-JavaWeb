/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
  var id,Nombre,Nivel,Lenguaje1,Lenguaje2,Lenguaje3,Tecnologia1,Tecnologia2,Tecnologia3;
  Nombre=document.getElementById("Nombre").value;
  Nivel=document.getElementById("Nivel").value;
   id=document.getElementById("id").value;
   Lenguaje1=document.getElementById("Lenguaje1").value;
   Lenguaje2=document.getElementById("Lenguaje2").value;
   Lenguaje3=document.getElementById("Lenguaje3").value;
   Tecnologia1=document.getElementById("Tecnologia1").value;
    Tecnologia2=document.getElementById("Tecnologia2").value;
   Tecnologia3=document.getElementById("Tecnologia3").value;
   
   
   if(Nombre===""|| id==="" || Lenguaje1==="" || Lenguaje2==="" || Lenguaje3==="" || Tecnologia1==="" || Tecnologia2==="" || Tecnologia3==="" || Nivel===""){
       alert("Todos los campos son obligatorios");
       return false;
   }  else if(isNaN(Nivel)){
       alert("El Nivel ingresado no es un numero");
       return false;
   }
   else if(isNaN(id)){
       alert("Esta identificacion de la Caracteristica no es valida");
       return false;
   }
  
    alert("Datos agregados Correctamente");
}

