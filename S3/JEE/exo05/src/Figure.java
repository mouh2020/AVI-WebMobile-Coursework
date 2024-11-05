public abstract class Figure {
    double center_x;
    double center_y;

    public Figure() {
    }

    public Figure(double center_x, double center_y) {
        this.center_x = center_x;
        this.center_y = center_y;
    }

    public void translation (double dx,double dy){
        this.center_x+=dx;
        this.center_y+=dy;
        System.out.println("Translation du x : " + this.center_x );
        System.out.println("Translation du y : " + this.center_y );

    }
    public abstract double perimetre();
    public abstract double surface();

    @Override
    public String toString() {
        return "Figure{" +
                "center_x=" + center_x +
                ", center_y=" + center_y +
                '}';
    }
}
