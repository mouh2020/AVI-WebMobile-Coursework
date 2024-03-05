#include <stdio.h>
#include <stdlib.h>
int main()
{
    double radius;
    double pi = 3.14;
    double perimeter;
    double surface;
    printf("Please enter the radius of your cercle : ");
    scanf("%lf",&radius);
    perimeter= radius*2*pi;
    surface  = radius*radius*pi;
    printf("The perimeter is : %lf \n",perimeter);
    printf("The surface is : %lf \n",surface);

    return 0;
}