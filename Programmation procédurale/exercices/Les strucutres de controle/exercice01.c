#include <stdio.h>
#include <stdlib.h>

int main() 
{
    int a;
    printf("Veuillez entrer un nombre : ");
    scanf("%i",&a);
    if (a = 0) {
        printf("Votre nombre est null");
    }
    else if (a > 0 ) {
        printf("Votre nombre est positif");
    }
    else if (a < 0 ) {
        printf("Votre nombre est negatif");
    };

    return 0;
}