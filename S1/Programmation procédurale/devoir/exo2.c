#include <stdio.h>
#include <stdlib.h>

int main() {
    int age;
    printf("La categorie age : veuillez saisir votre age SVP : ");
    scanf("%d",&age);
    if (age>=1 && age <= 5) {
        printf("Maternelle\n");
    }
    else if (age>=6 && age <=7) {
        printf("Poussin\n");
    }
    else if (age>=8 && age <=9) {
        printf("Pappile\n");
    }
    else if (age>=10 && age <=11) {
        printf("Minime\n");
    }
    else if (age>=12) {
        printf("Cadet\n");
    }
    else {
        printf("Error Veillez saisir une valeur correcte");
    };

    return 0;
}