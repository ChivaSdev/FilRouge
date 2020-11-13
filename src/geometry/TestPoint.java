package geometry;

public class TestPoint {

    public static void main (String [] args) {
        
        Point point = new Point(3, 4);
        System.out.println("Coordonnée en x du point : " + point.getX());
        System.out.println("Coordonnée en y du point : " + point.getY());
        System.out.println("Représentation du point : " + point.getRepresentation());
        
        Point point2 = point.symmetricX();
        System.out.println("Coordonnées symétrique du point par rapport à l'axe des x : " + point2.getRepresentation());
        

    }
}