package volumes;

public class Cylinder extends Figure {

    protected double radius;

    public Cylinder(double radius, double height) {
        super(height);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double basisSurface() {
        return (Math.PI * this.radius * this.radius);
    }

}