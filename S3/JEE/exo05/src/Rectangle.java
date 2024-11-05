public class Rectangle extends Figure {
    double largeur;
    double longueur;

    public Rectangle(double center_x, double center_y, double largeur, double longueur) {
        super(center_x, center_y);
        this.largeur = largeur;
        this.longueur = longueur;
    }
    @Override
    public double perimetre() {
        return (this.longueur+this.largeur)*2;
    }
    @Override
    public double surface() {
        return this.longueur*this.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "largeur=" + largeur +
                ", longueur=" + longueur +
                '}';
    }
}
