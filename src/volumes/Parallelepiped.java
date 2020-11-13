package volumes;

public class Parallelepiped extends Figure {

    protected double width;

    protected double length;

    public Parallelepiped(double width, double length, double height) {
        super(height);
        this.width = width;
        this.length = length;
    } 

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double basisSurface() {
        return this.width * this.length;
    }

}