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
public class Caracteristicas_has_Oferente {
   private String caracteristicas_id;
   private String _Oferente_id;
   private String nivel;

    public String getCaracteristicas_id() {
        return caracteristicas_id;
    }

    public void setCaracteristicas_id(String caracteristicas_id) {
        this.caracteristicas_id = caracteristicas_id;
    }

    public String getOferente_id() {
        return _Oferente_id;
    }

    public void setOferente_id(String _Oferente_id) {
        this._Oferente_id = _Oferente_id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
