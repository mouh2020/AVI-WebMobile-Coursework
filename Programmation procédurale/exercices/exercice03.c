#include <stdio.h>
#include <stdlib.h>
#define cmc  3
#define cpp  5
#define cis  4

int main()
{
    float mc;
    float pp;
    float is;
    float moy;
    char nom,prenom;
    printf("Entrez votre nom : ");
    scanf("%s",&nom);
    printf("Entrez votre prenom :");
    scanf("%s",&prenom);
    printf("Entrez votre note de methode de conception :");
    scanf("%f",&mc);
    printf("Entrez votre note de programmation procedurale :");
    scanf("%f",&pp);
    printf("Entrez votre note de interfaces statiques :");
    scanf("%f",&is);
    moy = (mc*cmc+pp*cpp+is*cis)/(cmc+cpp+cis);
    printf("Resultats de %c %c \n",nom,prenom);
    printf("a obtenu : %f \n",moy);
    return 0;
}