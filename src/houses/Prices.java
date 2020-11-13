package houses;

import java.util.Arrays;

public class Prices {

    protected float intAreaPrice;

    protected float extAreaPrice;

    public Prices(float intAreaPrice, float extAreaPrice) {
        this.intAreaPrice = intAreaPrice;
        this.extAreaPrice = extAreaPrice;
    }

    public float getPrice(House house) {
        return house.getPrice(intAreaPrice, extAreaPrice);
    }

    public float getPrice(House[] houses) {
        float sumPrices = 0f;
        for (int i=0; i<houses.length; i++) {
            sumPrices = sumPrices + this.getPrice(houses[i]);
        }

        return sumPrices;
    }
}