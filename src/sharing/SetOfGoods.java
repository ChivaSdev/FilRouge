package sharing;

import java.util.ArrayList;

public class SetOfGoods implements Sharable {

    protected ArrayList<Sharable> objectSharables;

    /**
     * Buil a new instance.
     * Initialize an empty ArraListe of type Sharable 
     */
    public SetOfGoods() {
        this.objectSharables = new ArrayList<>();
    }

    public void addGood(Sharable good) {
        this.objectSharables.add(good);
    }

    @Override 
    public SetOfGoods share(int nbPersons) {
        SetOfGoods objectsShared = new SetOfGoods();
        for (Sharable obj : this.objectSharables) {
            objectsShared.addGood(obj.share(nbPersons));
        }
        return objectsShared;
    }

    @Override
    public SetOfGoods remainder(int nbPersons) {
        SetOfGoods objectsRemainding = new SetOfGoods();
        for (Sharable obj : this.objectSharables) {
            objectsRemainding.addGood(obj.remainder(nbPersons));
        }
        return objectsRemainding;
    }

    public String toString() {
        return this.objectSharables.toString();
    }
}