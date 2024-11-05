public class Chien extends AnimalCompagne {
    public Chien(String nom) {
        super(nom);
    }
    @Override
    public void parler() {
        System.out.println("Haou Haou");
    }
    @Override
    public  void appeler() {
        super.appeler();
    }
}