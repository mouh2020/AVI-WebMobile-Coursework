package S2.java.travaux_pratiques;
import java.util.Scanner;

public class Exos {

    public static void main(String[] args) {
        /*
        Exo01

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

        // Exo5

        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir deux nombres : ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if (a>b) {
            System.out.println( a + " est le nombre superieur");
        }
        else {
            System.out.println( b + " est le nombre superieur");
        }
        */
        /* 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre : ");
        float a = scanner.nextInt();
        if (a%2 == 0) System.out.println("Le nombre est pair");
        else System.out.println("Le nombre est impair");
        */



        
        // les boucles

        /*
        
      int note = 10;
       
       switch (note) {
       case 0:
         System.out.println("faible");
         break;
      
       case 10:
         System.out.println("Bien");
         break;
         
       case 20:
         System.out.println("Tre bien");
       break;
       
       default:
         System.out.println("Sysntex error");
  
    }
        */

        /*
        
    int month = 11;
     
     switch (month) {
     case 12,1,2:
       System.out.println("Hiver");
       break;
    
     case 3,4,5:
       System.out.println("printemps");
       break;
       
     case 6,7,8:
       System.out.println("ete");
     break;
     
     case 9,10,11:
       System.out.println("autoumne");
       break;
     
     default:
       System.out.println("Sysntex error");

  }
        */

        /*
            
        Scanner scanner = new Scanner(System.in);
            int num1;
    
            System.out.print("Entrer un nombre 1 : ");
    
            num1 = scanner.nextInt();
            
            scanner.close();
            
            
            if (num1 % 2 == 0)
               System.out.println("le nombre  "+ num1+ " est un nombre pair");
              else 
                System.out.println("le nombre "+ num1+ " est un nombre impair"); 
        */

        /*
            for (int i = 1; i <= 10; i++)
                {
                System.out.println("Voici la ligne "+i);
                }
        */

        /*
            int i =1;
                
                do 
                {  
                  System.out.println("Voici la ligne "+i);
                  i++;
                  }while (i <= 5);
            
              }
        */

        /*
            
            int i =1;
            
            while (i <= 5)
            {  
              System.out.println("Voici la ligne "+i);
              i++;
              }
          }
        */
    }
    
}
