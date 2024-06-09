package S2.java.les_classes;

public class Rectangle {
    double longueur,largeur;
    public Rectangle(){

        longueur = 5;
        largeur  = 5;
    }
    public Rectangle(int longueur,int largeur){
        this.longueur = longueur;
        this.largeur  = largeur;
    }
    public double perimetre(){
        return (this.largeur + this.longueur) * 2;
    }
    public double aire(){
        return this.largeur * this.longueur;
    }
    public String estCarre(){
        if (this.largeur == this.longueur){ 
            return "Il est un carré";
        } 
        else {return "Il n'est pas un carré";}
    }
    public void afficherRectange(){
        System.out.print("\n\n----Les informations du livre----\n"+
        "- Longueur : "+this.longueur+"\n"+
        "- Largeur : "+this.largeur+"\n"+
        "- Perimietre : " + perimetre()+"\n"+
        "- Aire : " + aire()+"\n"+
        "- " + estCarre() + "\n" +
        "---------------------------------\n");
    }

    }

