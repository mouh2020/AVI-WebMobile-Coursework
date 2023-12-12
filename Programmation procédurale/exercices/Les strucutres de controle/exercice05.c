#include <stdlib.h>
#include <stdio.h>

int main()
{
    float t;
    float montant;
    printf("Veiullez saisir le temps : ");
    scanf("%f",&t);
    montant = 0;
    if (t<0){
        printf("Erreur.\n");
    }
    else {if ((t<=15)&& (t >0)){
        montant = 5;
    }
    else if (t!=0){
         montant = 5 + (((t-15)*15)/20);
    }   
    printf("Le montant est : %f DA.\n",montant);}
}