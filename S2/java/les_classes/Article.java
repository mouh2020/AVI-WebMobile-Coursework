package S2.java.les_classes;

public class Article {
    private int ref;
    private String desi;
    private double prixht;
    static double tva =0.19;

    public Article() {
        this.ref = 158003;
        this.desi= "Aricle 03";
        this.prixht = 5990;
    }

    public Article(int ref, String desi, double prixht) {
        this.ref = ref;
        this.desi = desi;
        this.prixht = prixht;
    }

    public Article(int ref, String desi) {
        this.ref = ref;
        this.desi = desi;
    }

    public int getRef() {
        return this.ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getDesi() {
        return this.desi;
    }

    public void setDesi(String desi) {
        this.desi = desi;
    }

    public double getPrixht() {
        return this.prixht;
    }

    public void setPrixht(double prixht) {
        this.prixht = prixht;
    }
    
    public double calculerPrixTTC(double prix) {
        return ((prix)+(prix*tva));
    }
    @Override
    public String toString() {
        return "{" +
            " ref='" + getRef() + "'" +
            ", desi='" + getDesi() + "'" +
            ", prixht='" + getPrixht() + "'" +
            "}";
    }

}
