package S2.java.travaux_pratiques;

public class Exos {

    public static void main(String[] args) {
        // Exo01

        int a = 15;
        int b = 17;
        System.out.println("\nLa valeur de a : " + a + "\n"+
                         "La valeur de b : " + b + "\n");

        // Exo2

        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("La valeur de a : " + a + "\n"+
                         "La valeur de b : " + b + "\n\n");

        // Exo3

        int nombre = 5, diviseur=2;

        System.out.println("Le quotien de la division est : " + (nombre/diviseur) + "\n" +
                           "Le reste de la diision est : " + (nombre%diviseur) + "\n\n");



    }
    
}
