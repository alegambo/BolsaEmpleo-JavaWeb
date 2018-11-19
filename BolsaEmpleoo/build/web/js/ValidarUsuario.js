/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar(){
  var id,clave,tipo;
  
   id=document.getElementById("id").value;
   clave=document.getElementById("clave").value;
   tipo=document.getElementById("tipo").value;
   
   
   if(id===""||clave==="" || tipo===""){
       alert("Todos los campos son obligatorios");
       return false;
   } else if(id.length>10){
       alert("La cedula es muy extensa es muy extenso");
       return false;
   } else if(clave.length<6){
       alert("La clave es muy fácil debe ser menor a 6 caracteres");
       return false;
   }
   else if(isNaN(id)){
       alert("La cedula no es valida, deben ser solo numeros");
       return false;
   }else if(tipo.length>1){
       alert("El tipo ser solo 1 para Oferente o 2 para Empresa");
       return false;
   }else if(tipo==="0" ||tipo==="3" ||tipo==="4" ||tipo==="5" ||tipo==="6" ||tipo==="7" ||tipo==="8" ||tipo==="9"){
       alert("El Tipo Debe ser solo 1 para Oferente o 2 para Empresa");
       return false;
       
   }
   else if(isNaN(tipo)){
       alert("El tipo debe ser solo 1 para Oferente o 2 para Empresa");
       return false;
   }
   
    alert("Datos agregados");
}




