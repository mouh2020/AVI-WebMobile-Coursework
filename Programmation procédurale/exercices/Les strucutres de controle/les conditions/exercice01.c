#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int a;
    printf("Veuillez entrer un nombre : ");
    scanf("%d",&a);
    if (a > 0) {
        printf("Votre nombre est positif\n");
        } 
    else if (a < 0 ) {
        printf("Votre nombre est negatif\n");
        } 
    else {
        printf("Votre nombre est null\n");
        }

    return 0;
}