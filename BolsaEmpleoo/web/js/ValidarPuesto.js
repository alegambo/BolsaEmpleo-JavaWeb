/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
  var id,NombrePuesto,Salario,Tipo,Empresa_id;
  NombrePuesto=document.getElementById("NombrePuesto").value;
   id=document.getElementById("id").value;
   Salario=document.getElementById("Salario").value;
   Tipo=document.getElementById("Tipo").value;
   Empresa_id=document.getElementById("Empresa_id").value;
   var cadena1="Publico";
   var cadena2="Privado";
   
   
   if(NombrePuesto===""|| id==="" || Salario==="" || Tipo==="" || Empresa_id===""){
       alert("Todos los campos son obligatorios");
       return false;
   }  else if(isNaN(Salario)){
       alert("El Salario ingresado no es un numero");
       return false;
   }
   else if(isNaN(id)){
       alert("Esta identificacion del Puesto no es valida");
       return false;
   }
   else if(Tipo!=cadena1 && Tipo!==cadena2 ){
    alert("En el tipo Debe escribir Unicamente si es Publico o Privado");
    return false;
       
   }else if(isNaN(Empresa_id)){
       alert("esta cedula no es valida");
       return false;
   }
    alert("Datos agregados Correctamente");
}


