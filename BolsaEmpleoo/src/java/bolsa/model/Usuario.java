package bolsa.model;

public class Usuario {

    private String ID;
    private String nom;
    private int prenom;

    public String getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public int getPrenom() {
        return prenom;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public void setNom(String clave) {
        this.nom = clave;
    }

    public void setPrenom(int tipo) {
        this.prenom = tipo;
    }

    public String esTipo() {
        if (getPrenom() == 1) {
            return "Oferente";
        }
        if (getPrenom() == 2) {
            return "Empresa";
        }
        return "Tipo Invalido, Cambie el tipo de Usuario";

    }

}
