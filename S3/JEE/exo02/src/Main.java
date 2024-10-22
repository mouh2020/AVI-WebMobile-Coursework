public class Main {
    public static void main(String[] args) {
        Ville ville01 = new Ville("Annaba","Algerie",15000);
        Ville ville02 = new Ville("Oran","Algerie",25000);
        ville02.setNomVile("Alger");
        Ville ville03 = new Ville();
        ville03.setNomVile("Constantine");
        ville03.setNomPays("Algerie");
        ville03.setNbrHabitants(20000);
        System.out.println(ville02.afficher());
        System.out.println(ville03.afficher());
        VilleAgricole mavilleagri = new VilleAgricole("Annaba","Algerie",15000,"Dattes",15000);
        VilleIndustrielle indville = new VilleIndustrielle("Hassi Messaoud","Algerie",17000,"Pétrole",5);
        System.out.println(mavilleagri.afficher());
        System.out.println(indville.afficher());

    }
}