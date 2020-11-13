package volumes;

public class Prism extends Figure {

    protected double basisLength;

    protected double basisHeight;

    public Prism(double basisLength, double basisHeight, double height) {
        super(height);
        this.basisLength = basisLength;
        this.basisHeight = basisHeight;
    }

    public double getBasisLength() {
        return this.basisLength;
    }

    public double getBasisHeight() {
        return this.basisHeight;
    }

    public double basisSurface() {
        return (this.basisHeight * this.basisLength / 2);
    }
}