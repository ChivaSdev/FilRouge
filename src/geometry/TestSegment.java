package geometry;

public class TestSegment {

    public static void main (String [] args) {

        Point point1 = new Point(3,4);
        Point point2 = new Point(7,7);
        Segment segment = new Segment(point1, point2);

        System.out.println("Représentation du segment : " + segment.getRepresentation());
        System.out.println("Longueur du segment : " + segment.length());

    }
}