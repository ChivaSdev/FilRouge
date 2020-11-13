package geometry;

public class Point {

    // Initialisation of 2 attributes 

    private int coordX;
    private int coordY;

    // Constructor of the class Point
    public Point(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getX() {
        return this.coordX;
    }

    public int getY(){
        return this.coordY;
    }

    public String getRepresentation() {
        return "(" + this.getX() + "," + this.getY()+ ")";
    }

    public Point symmetricX() {
        return new Point(this.coordX, -this.coordY);
    }

    public void translate(int deltaX, int deltaY){
        this.coordX = this.coordX + deltaX;
        this.coordY = this.coordY + deltaY;
    }
}
