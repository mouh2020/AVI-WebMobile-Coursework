import java.util.Scanner;
public class Exos {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("\nEnter the table's length : ");
        int length = sc.nextInt();
        int table[] = new int[length];
        for (int i = 0 ; i < table.length ; i++){
            System.out.print("\nEnter the element "+(i+1)+" : ");
            table[i] = sc.nextInt();
        }
        System.out.print("\nThe elements of your table : ");
        for (int i = 0 ; i < table.length ; i ++){
            System.out.print(" "+table[i]);
        }
        System.out.print("\n\nEnter the position of the new value : ");
        int newValuePos = sc.nextInt();
        newValuePos-=1; /*The index of the value on the table. */
        while (newValuePos < 0  || newValuePos > table.length){
            System.out.print("\nPlease enter a valid position of the new value : ");
            newValuePos = sc.nextInt() - 1 ; /*The index of the value on the table. */
        }
        System.out.print("\nEnter the new value of position " + (newValuePos+1) + " : ");
        int newValue = sc.nextInt();
        int newTable[] = new int[length+1];
        boolean is_inserted = false;
        for (int i = 0 ; i < newTable.length ; i++){
            if (i == newValuePos) {
                newTable[i] = newValue;
                is_inserted = true;
            }
            else if (is_inserted) {
                newTable[i] = table[i-1];
            }
            else {
                newTable[i] = table[i];
            }
        }
        System.out.print("\nThe elements of your new table : ");
        for (int i = 0 ; i < newTable.length ; i ++){
            System.out.print(" "+newTable[i]);
        }
        System.out.print("\n\n");
        sc.close();
    }
}