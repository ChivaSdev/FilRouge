package houses;

import java.util.Arrays;

public class HousesMain {

    public static void main(String [] args) {
        House house = new House("London", 60);
        float interiorPrice = 4000.75f;
        float exteriorPrice = 5000.75f;

        System.out.println(house.getAddress());

        if (house.getPrice(interiorPrice, exteriorPrice) == 240045) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }

        Property property = new Property("London", 60, 120);

        if (property.getPrice(interiorPrice, exteriorPrice) == 840135) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }

        Prices prices = new Prices(interiorPrice, exteriorPrice);

        if ((prices.getPrice(house) == 240045) && (prices.getPrice(property) == 840135)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }

        House[] houses = {new House("London", 150), new House("Paris", 30), new Property("Caen", 100, 250)};
        System.out.println(prices.getPrice(houses));  

    }

}