public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,7,6,9);
        Cercle cercle = new Cercle(5,6,3);
        System.out.println(rectangle.toString());
        rectangle.translation(5,5);
        System.out.println("Le perimetre de la rectangle est : " +rectangle.perimetre());
        System.out.println("La surface de la rectangle est : " +rectangle.surface());
        System.out.println("#####################################");
        System.out.println(cercle.toString());
        cercle.translation(5,5);
        System.out.println("Le perimetre de la cercle est : " +cercle.perimetre());
        System.out.println("La surface de la cercle est : " +cercle.surface());

    }
}