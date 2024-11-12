public class Voiture implements Vehicule {
    String nomVoiture = "Symbol";
    public  void claxonner(){
        System.out.println("Pip pip!");
    }
    public void stationner(){
        System.out.println("Le voiture "+ nomVoiture +" stationne");
    }
    public void afficher(){
        System.out.println("Nom voiture est un "+ nomVoiture);
    }
}