package volumes;

public abstract class Figure {

    protected double height;

    public Figure(double height) {
        this.height = height;
    }
 
    public double getHeight() {
        return this.height;
    }

    public abstract double basisSurface();

    public double volume() {
        return this.basisSurface() * this.height;
    }
}
