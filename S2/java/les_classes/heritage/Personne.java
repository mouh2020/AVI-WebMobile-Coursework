package S2.java.les_classes.heritage;
import java.util.Objects;

public class Personne {
    protected  int cin;
    protected String nom,prenom,adresse,email,tel;

    public Personne() {
    }

    public Personne(int cin, String nom, String prenom, String adresse, String email, String tel) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
    }

    public int getCin() {
        return this.cin;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTel() {
        return this.tel;
    }

    public void afficher() {
        System.out.println( "Personne : {" +
            " cin='" + getCin() + "'" +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", email='" + getEmail() + "'" +
            ", tel='" + getTel() + "'" +
            "}");
    }

    
    
}

