package S2.java.les_classes.heritage.exo1;

public class Ville {
    private String nomVille,nomPays;
    private int nbrHabitants;

    public Ville() {
        nomVille = "Alger";
        nomPays  = "Algeria";
        nbrHabitants = 256000;
        }

    public Ville(String nomVille, String nomPays, int nbrHabitants) {
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nbrHabitants = nbrHabitants;
    }
    
    public String comparer(Ville ville){
        if (ville.nbrHabitants > this.nbrHabitants) {
            return ville.nomVille + " a plus d'habitants que "+ this.nomVille;
        }
        return this.nomVille + " a plus d'habitants que "+ ville.nomVille;
    }

    public String description() {
        return "Ville : {" +
            " nomVille='" + nomVille + "'" +
            ", nomPays='" + nomPays + "'" +
            ", nbrHabitants='" + nbrHabitants+ "'" +
            "}";
    }

}
