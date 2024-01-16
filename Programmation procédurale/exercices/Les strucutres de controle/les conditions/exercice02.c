#include <stdio.h>
#include <stdlib.h>

int main ()
{
    char operation;
    float a,b,r;
    printf("Veuiller entrer un nombre : ");
    scanf("%f",&a);
    printf("Veuiller entrer un nombre : ");
    scanf("%f",&b);
    printf("Veuiller entrer une operation (+,-,*,/) : ");
    scanf("%s",&operation);
    switch (operation)
    {
        case '+' : 
        r = a + b;
        printf("Le resultat est : %f\n",r);
        break;
        case '-' :
        r = a - b ;
        printf("Le resultat est : %f\n",r);
        break;
        case '*' : 
        r = a * b ;
        printf("Le resultat est : %f\n",r);
        break;
        case '/' :
        if (b=0) {
            printf("Division par zero est impossible.");
            break;
            }
        else {
            r = a/b;
            printf("Le resultat est : %f\n",r);
            break;
            }
        
    }
    return 0;

}