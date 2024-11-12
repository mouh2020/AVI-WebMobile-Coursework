public class Camion implements Vehicule {
    String nomCamion = "Semiremorque";
    public  void claxonner(){
        System.out.println("Poum Poum!");
    }
    public void stationner(){
        System.out.println("Le camion "+ nomCamion +" stationne");
    }
    public void afficher(){
        System.out.println("Nom camion est un "+ nomCamion);
    }
}
