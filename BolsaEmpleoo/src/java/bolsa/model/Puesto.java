/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.model;

import java.util.ArrayList;

/**
 *
 * @author Anayansi
 */
public class Puesto {
    private String ID;
    private String nombrePuesto;
    private String tipo;
    private String salario;
    private String empresa_id;
   ArrayList<Puesto> puesto;
    public String getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(String empresa_id) {
        this.empresa_id = empresa_id;
    }

   

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public boolean esTipo(){
    if(getTipo()=="Publico"){
    return true;
    }
    return false;
    
    }
    
}
