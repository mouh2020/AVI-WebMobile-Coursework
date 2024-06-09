package S2.java.les_classes.heritage;

public class Professeur  extends Personne {
    protected double prr,salaire;

    public Professeur() {
        prr = 5000;
        salaire = 50000;
    }

    public Professeur(int cin, String nom, String prenom, String adresse, String email, String tel, double prr, double salaire) {
        super(cin, nom, prenom, adresse, email, tel);
        this.prr = prr;
        this.salaire = salaire;
    }
    @Override
    public void afficher() {
        // TODO Auto-generated method stub
        super.afficher();
    }
}
