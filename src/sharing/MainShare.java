package sharing;

public class MainShare {

    public static void main (String [] args) {

        MarbleBag marbleBag = new MarbleBag(10);
        OrangeJuice orangeJuice = new OrangeJuice(35);
        OrangeJuice secondOrangeJuice = new OrangeJuice(50);
    
        System.out.println(marbleBag);
        System.out.println(orangeJuice);

        System.out.println(marbleBag.share(3).toString());
        System.out.println(orangeJuice.share(3).toString());

        SetOfGoods objectsShared = new SetOfGoods();
        objectsShared.addGood(marbleBag);
        objectsShared.addGood(orangeJuice);
        objectsShared.addGood(secondOrangeJuice);

        System.out.println("List of objects not shared yet : " + objectsShared.toString());
        System.out.println("Sharing objects...");
        System.out.println(objectsShared.share(3).toString());
        System.out.println(objectsShared.remainder(3).toString());

        
    }
}
