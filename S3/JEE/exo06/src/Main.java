public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion();
        camion.afficher();
        camion.claxonner();
        camion.stationner();
        System.out.println("################");
        Voiture voiture = new Voiture();
        voiture.afficher();
        voiture.claxonner();
        voiture.stationner();

    }
}