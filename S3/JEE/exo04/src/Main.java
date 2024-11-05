public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat("SamChat");
        Chien chien = new Chien("SamDog");
        chien.appeler();
        chat.parler();
        chat.appeler();
        chien.parler();

    }
}