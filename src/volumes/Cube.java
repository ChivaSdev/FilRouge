package volumes;

import volumes.Parallelepiped;

public class Cube extends Parallelepiped {

    public Cube(double edgeSize) {
        super(edgeSize, edgeSize, edgeSize);
    }

    public double getEdgeSize() {
        return this.height;
    }
}