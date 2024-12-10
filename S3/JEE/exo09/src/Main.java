import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> nom_set = new HashSet<String>();
        Set<String> ens1 = new HashSet<String>();
        nom_set.add("Mohammed");
        nom_set.add("Samy");
        nom_set.add("Houssem");
        System.out.println("nom_set: "+nom_set);
        if (nom_set.contains("Amine")) System.out.println("Exist");
        else System.out.println("Not existed");
        //
        ens1.add("Houssem");
        ens1.add("Mohammed");
        ens1.add("Abdullah");
        System.out.println("ens1: "+ens1);
        //
        Set<String> union = new HashSet<String>(nom_set);
        Set<String> intersection = new HashSet<String>(nom_set);
        Set<String> difference = new HashSet<String>(nom_set);
        //
        union.addAll(ens1);
        System.out.println("union: "+union);
        //
        intersection.retainAll(ens1);
        System.out.println("intersection: "+intersection);
        //
        difference.removeAll(ens1);
        System.out.println("difference: "+difference);



    }
}