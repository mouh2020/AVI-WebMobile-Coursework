
class methodes {
    public static void message() {
        System.out.println("Ceci un message d'une methode.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int resultat;
        message();
        resultat= add(a,b);
        System.out.println(resultat);
    }
}