package S2.java.les_boucles;

public class Boucles {
    public static void main(String[] args) {
    int j=0,k=0;
    do {
        if(j%2==1) {
            int u=j;
                while(u>0) {
                    k=k+1;
                    u=u/2;
                }
        } 
        else {
            for(int v=-1;v<4;v++) {
                
                k=k+2;
            }
        }
        j=j+1;
        } while(j<5);
    System.out.println("k = "+k);
        }
    
}
