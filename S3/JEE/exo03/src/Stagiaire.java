public class Stagiaire {
    String nom;
    String prenom;
    int age;
    double moyenne;

    public Stagiaire() {
    }

    public Stagiaire(String nom, String prenom, int age, double moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public String afficherStagiaire() {
        return "Stagiaire{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", moyenne=" + moyenne +
                '}';
    }

    public String afficheAppreciation(){
        if (moyenne<10) {
            return  "Mauvais";
        } else if (moyenne >= 10 && moyenne < 12) {
            return "Passable";
        } else if (moyenne >= 12 && moyenne < 14) {
            return "A Bien";
        } else if (moyenne >= 14 && moyenne < 16) {
            return "Bien";
        } else if (moyenne >= 16 && moyenne < 18) {
            return "T Bien";
        } else {
            return "Excellent";
        }
    }
}
