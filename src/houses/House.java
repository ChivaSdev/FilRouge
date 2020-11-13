package houses;

public class House {

    /** This class represents an house without garde
    @param adress String : postal adress of the house
    @param intArea int : interior area of the house 
     */

    protected String address;

    protected int intArea;

    public House (String address, int intArea) {
        this.address = address;
        this.intArea = intArea;
    }

    public String getAddress() {
        return this.address;
    }

    public float getPrice(float interiorPriceArea, float exteriorPriceArea) {
        return this.intArea * interiorPriceArea;
    }


}
