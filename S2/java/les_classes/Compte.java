package S2.java.les_classes;

public class Compte {
    double solde;
    String titulaire;
    public Compte(){
        solde = 0;
        titulaire = "Med";
    }
    public Compte(String titulaire) {
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public void afficher(){
        System.out.println("Le solde de "+this.titulaire+" est :"+this.solde);
    }
    public void deposer(double montant){
        this.solde+=montant;
        System.out.println(this.titulaire+" a deposé : "+ montant);
    }
    public void retirer(double montant){
        this.solde-=montant;
        System.out.println(this.titulaire+" a retiré : "+ montant);
    }
    public void virer(double montant,String destinataire){
        retirer(montant);
        System.out.println(this.titulaire+" a viré : "+ montant+ " à "+destinataire);
    }
}
