#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i,a,counter;
    counter = 0 ;
    printf("Veuillez saisir un nombre : ");
    scanf("%d",&a);
    if (a < 0) 
    {
        printf("Veullez entrer un nombre positif.\n");
    }

    else 
    {
        for ( i=1;i<=a;i++)
        {
            counter=counter+i;
        
        }
        printf("La somme est : %d\n",counter);
    }
    
    return 0;
    

}