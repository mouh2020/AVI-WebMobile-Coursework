#include <stdlib.h>
#include <stdio.h>

int main()
{
    int i,n,counter;
    counter = 1;
    printf("Veuillez entrer un nombre : ");
    scanf("%d",&n);
    if (n<0)
    {
        printf("Veuillez entrer un nombre positif.\n");
    }
    else
    {
        for (i=n;i>=1;i--)
        {
            counter=counter*i;
        }
        printf("Le resultat est : %d\n",counter);
    }
    return 0;

}