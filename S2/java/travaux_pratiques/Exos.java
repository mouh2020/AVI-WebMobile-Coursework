package S2.java.travaux_pratiques;
import java.util.Scanner;

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
                           "Le reste de la division est : " + (nombre%diviseur) + "\n\n");

        // Exo3 avec Scanner

        Scanner scanner = new Scanner(System.in);
        int nbr,div;

        System.out.print("Veuillez entrer un nombre entier : ");

        nbr = scanner.nextInt();

        System.out.print("Veuillez entrer le diviseur: ");

        div = scanner.nextInt();

        System.out.println("\nLe quotien de la division est : " + (nbr/div) + "\n" +
                           "Le reste de la division est : " + (nbr%div) + "\n\n");
        scanner.close();

    }
    
}
