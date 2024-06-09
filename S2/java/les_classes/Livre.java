package S2.java.les_classes;

public class Livre {
    String title,author;
    int price;
    public Livre(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void afficher() {
        System.out.print("\n\n----Les informations du livre----\n"+
        "- Titre : "+this.title+"\n"+
        "- Author : "+this.author+"\n"+
        "- Price : " + this.price+"\n"+
        "---------------------------------\n");
    }
    
}
