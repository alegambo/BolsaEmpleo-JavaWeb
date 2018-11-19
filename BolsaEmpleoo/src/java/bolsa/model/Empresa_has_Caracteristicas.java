/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolsa.model;

/**
 *
 * @author Anayansi
 */
public class Empresa_has_Caracteristicas {
    private String caracteristicas_id;
    private String nivel;
    private String puesto;

    public String getCaracteristicas_id() {
        return caracteristicas_id;
    }

    public void setCaracteristicas_id(String caracteristicas_id) {
        this.caracteristicas_id = caracteristicas_id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}
