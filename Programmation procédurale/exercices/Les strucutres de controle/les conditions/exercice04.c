#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,c,z;
    printf("Ecrire 3 nombres : \n");
    scanf("%d%d%d",&a,&b,&c);
    if (b>a){
        z = b;
        b = a;
        a = z;
    }
    if (c>a) {
        z = c;
        c = a;
        a = z;
    }
    if (b<c){
        z = c;
        b = c;
        c = z;
    }
    printf("%d   %d   %d\n",a,b,c);

}