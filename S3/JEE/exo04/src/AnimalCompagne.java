public abstract class AnimalCompagne {
    public  String nom;

    public AnimalCompagne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public  abstract void parler();
    public  void appeler(){
        System.out.println("Nom Animal : "+ getNom());
    }
}

class Chat extends AnimalCompagne {
    public Chat(String nom) {
        super(nom);
    }
    @Override
    public void parler() {
        System.out.println("Meow Meao");
    }
}
