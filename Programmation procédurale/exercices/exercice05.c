#include <stdio.h>
#include <stdlib.h>
 int main()
 {
    float x,y,fx,cy;
    printf("Entrez la degrée en Celsius que vous souhaitez de converter en Fahrenheit : ");
    scanf("%f",&x);
    printf("Entrez la degrée en Faherheit que vous souhaitez de converter en Celsius : ");
    scanf("%f",&y);
    fx = x*9/5+32;
    cy = (y-32)*9/5;
    printf("La degrée de %f en Fahrenheit est : %f \n",x,fx);
    printf("La degrée de %f en Celisius est : %f \n",y,cy);
 }
