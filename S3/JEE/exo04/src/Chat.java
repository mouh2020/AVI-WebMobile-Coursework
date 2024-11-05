public class Chat extends AnimalCompagne {
    public Chat(String nom) {
        super(nom);
    }
    @Override
    public void parler() {
        System.out.println("Meow Meow");
    }
    @Override
    public  void appeler() {
        super.appeler();
    }
}
