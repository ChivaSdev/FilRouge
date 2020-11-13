package houses;

public class Property extends House {

    protected int exteriorArea;

    public Property(String address, int intArea, int exteriorArea) {
        super(address, intArea);
        this.exteriorArea = exteriorArea;
    }
    
    @Override
    public float getPrice(float interiorPriceArea, float exteriorPriceArea) {
        return super.getPrice(interiorPriceArea, exteriorPriceArea) + this.exteriorArea * exteriorPriceArea;
    }
}