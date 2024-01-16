#include <math.h>
#include <stdlib.h>
#include <stdio.h>

int main()
{
    double a,b,c,delta,x1,x2;
    printf("Veuillez enter la valuer de A : ");
    scanf("%lf",&a);
    if (a==0) {
        printf("L'equation est 1er degrée.\n");
        return 0;
    }
    printf("Veuillez enter la valuer de B : ");
    scanf("%lf",&b);
    printf("Veuillez enter la valuer de C : ");
    scanf("%lf",&c);
    delta = pow(b,2) -(4*a*c);
    if (delta==0){
        x1 = -b/(2*a);
        printf("La solution de l'equation est : %lf.\n",x1);
    }
    else if (delta>0) {
        x1 = -b-sqrt(delta)/2*a;
        x2 = -b+sqrt(delta)/2*a;
        printf("L'equation accepte deux solution sont : %lf,%lf.\n",x1,x2);
    }
    else {
        printf("L'equation n'accepte aucune solution.\n");
    }
}