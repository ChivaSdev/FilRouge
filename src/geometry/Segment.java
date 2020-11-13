package geometry; 

public class Segment {

    private Point extremX;
    private Point extremY;

    public Segment(Point extremX, Point extremY) {
        this.extremX = extremX;
        this.extremY = extremY;
    } 

    public String getRepresentation() {
        return "(" + extremX.getRepresentation() + "," + extremY.getRepresentation() + ")";

    }

    public Double length() {
        return Math.sqrt(Math.pow(extremY.getX() - extremX.getX(), 2) + Math.pow(extremY.getY() - extremX.getY(), 2));
    }
}