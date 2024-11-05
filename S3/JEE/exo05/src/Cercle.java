public class Cercle extends  Figure{
    double rayon;
    public Cercle(double center_x, double center_y, double rayon) {
        super(center_x, center_y);
        this.rayon = rayon;
    }
    @Override
    public double perimetre() {
        return (this.rayon*3.14*2);
    }
    @Override
    public double surface() {
        return (this.rayon*this.rayon*3.14);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
