public class Ville {
    String nomVille;
    String nomPays;
    int    nbrHabitants;

    public Ville() {
    }

    public Ville(String pNom, String pPays, int pNbre) {
        this.nomVille = pNom;
        this.nomPays = pPays;
        this.nbrHabitants = pNbre;
    }

    public String getNomVile() {
        return nomVille;
    }

    public void setNomVile(String nomVile) {
        this.nomVille = nomVile;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbrHabitants=" + nbrHabitants +
                '}';
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

}
