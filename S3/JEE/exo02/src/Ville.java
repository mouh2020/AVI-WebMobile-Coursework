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

    public String afficher() {
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

class VilleAgricole extends Ville {
    String produitAgricole;
    double soupTerres;

    public VilleAgricole(String pNom, String pPays, int pNbre, String produitAgricole, double soupTerres) {
        super(pNom, pPays, pNbre);
        this.produitAgricole = produitAgricole;
        this.soupTerres = soupTerres;
    }

    @Override
    public String afficher() {
        return "VilleAgricole{" +
                "produitAgricole='" + produitAgricole + '\'' +
                ", soupTerres=" + soupTerres +
                ", nomVille='" + nomVille + '\'' +
                ", nomPays='" + nomPays + '\'' +
                ", nbrHabitants=" + nbrHabitants +
                '}';
    }
}

class VilleIndustrielle extends Ville {
    String industrie;
    int nbUsines;

    public VilleIndustrielle(String pNom, String pPays, int pNbre, String industrie, int nbUsines) {
        super(pNom, pPays, pNbre);
        this.industrie = industrie;
        this.nbUsines = nbUsines;
    }

    @Override
    public String afficher() {
        return "VilleIndustrielle{" +
                "industrie='" + industrie + '\'' +
                ", nbUsines=" + nbUsines +
                ", nbrHabitants=" + nbrHabitants +
                ", nomPays='" + nomPays + '\'' +
                ", nomVille='" + nomVille + '\'' +
                '}';
    }
}