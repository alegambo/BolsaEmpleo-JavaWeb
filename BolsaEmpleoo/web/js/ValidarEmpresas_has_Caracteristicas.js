/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
  var Caracteristicas_id,nivel,Puesto_id;
  
   Caracteristicas_id=document.getElementById("Caracteristicas_id").value;
   nivel=document.getElementById("nivel").value;
   Puesto_id=document.getElementById("Puesto_id").value;
   
   
   
   if(Caracteristicas_id===""|| Puesto_id==="" || nivel===""){
       alert("Todos los campos son obligatorios");
       return false;
   }  else if(isNaN(nivel)){
       alert("El Nivel ingresado no es un numero");
       return false;
   }
   else if(isNaN(Caracteristicas_id)){
       alert("Esta identificacion de la Caracteristica no es valida");
       return false;
   }else if(isNaN(Puesto_id)){
       alert("Esta identificacion del Puesto Referido no es correcta");
       return false;
   }
  
    alert("Datos agregados Correctamente");
}



