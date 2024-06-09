package S2.java.les_classes.heritage.exo1;
public class TestP {
    public static void main(String[] args) {
        Capitale spain_capitale = new Capitale("Madrid", "Spain", 900000, "Santiago Bernabeu");
        Ville algeria_capitale = new Ville("Alger", "Algeria", 256000);
        System.out.println(spain_capitale.description());
    }
}