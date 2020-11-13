package sharing;

/**
 * Class which represents a bag of marbles that can be shared
 */
public class MarbleBag implements Sharable {
    
    protected int nbMarbles;

    /**
     * Build a new instance
     * @param nbMarbles : number of marbles in a bag
     */
    public MarbleBag(int nbMarbles) {
        this.nbMarbles = nbMarbles;
    }

    public int getNbMarbles() {
        return this.nbMarbles;
    }

    public String toString() {
        if (this.nbMarbles > 0) {
            return "bag of " + this.nbMarbles + " marbles";
        } else {
            return "empty bag";
        }
    }

    @Override
    public MarbleBag share(int nbPersons) {
        return new MarbleBag(this.nbMarbles/nbPersons);
    }

    @Override 
    public MarbleBag remainder(int nbPersons) {
        return new MarbleBag(this.nbMarbles%nbPersons);
    }
    
}
