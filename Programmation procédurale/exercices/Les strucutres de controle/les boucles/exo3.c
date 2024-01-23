#include <stdio.h>
#include <stdlib.h>

int main() {
    int som_pos=0,pro_neg=1,last_num = 1 ;
    do {
        printf("Veuillez entrer un nombre SVP : ");
        scanf("%d",&last_num);
        if (last_num<0){
            pro_neg*=last_num;
        }
        if (last_num>0){
            som_pos+=last_num;
        }
    } while (last_num !=0);
    printf("Somme : %d\nProduit : %d\n",som_pos,pro_neg);
}