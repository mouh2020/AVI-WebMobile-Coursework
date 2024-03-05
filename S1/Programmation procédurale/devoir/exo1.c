#include <stdio.h>
#include <stdlib.h>
#define g 9.80

int main(){
    float m,fgrav;
    printf("Veuillez saisir la masse de votre object en KG : ");
    scanf("%f",&m);
    if (m<0) {
        printf("Error: Votre nombre doit etre positis");
    }
    else {
        fgrav = m*g;
        printf("\nLa forece de graviation de votre objet de masse %f KG donne %f Newton\n",m,fgrav);
    }
    return 0;
}