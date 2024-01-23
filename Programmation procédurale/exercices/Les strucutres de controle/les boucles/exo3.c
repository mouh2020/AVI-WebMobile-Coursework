#include <stdio.h>
#include <stdlib.h>

int main() {
    int som_pos=0,pro_neg=1,last_num = 1 ;
    while (last_num !=0)
    {   
        printf("Veuillez entrer un nombre :");
        scanf("%d",&last_num);
        if ((last_num==0)&&(pro_neg==1)&&(som_pos==0)){
            pro_neg=0;
            printf("Votre liste est vide.\n");
        }
        else {
            if (last_num>0){
                som_pos+=last_num;
            }
            else if (last_num<0){
                pro_neg*=last_num;
            }
            else {
                printf("Somme : %d\nProduit : %d\n",som_pos,pro_neg);
            }
            }
    }
    
}