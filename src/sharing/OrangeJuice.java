package sharing; 

public class OrangeJuice implements Sharable {
    
    protected float quantity;

    /** 
     * Build a new instance
     * @param quantity : orange juice's quantity
     */
    public OrangeJuice(float quantity) {
        this.quantity = quantity;
    }

    public float getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return this.quantity + " cl of orange juice";
    }

    @Override
    public OrangeJuice share(int nbPersons) {
        return new OrangeJuice(this.quantity/nbPersons);
    }

    @Override
    public OrangeJuice remainder(int nbPersons) {
        return new OrangeJuice(0);
    }
}
