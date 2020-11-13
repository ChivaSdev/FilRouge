package houses;

import housestests.HouseTests;
import housestests.PropertyTests;
import housestests.PricesTests;

public class HousesTests {

    public static void main(String [] args) {
        boolean ok = true;
        HouseTests houseTester = new HouseTests();
        ok=ok&&houseTester.testGetAddress();
        ok=ok&&houseTester.testGetPrice();
        PropertyTests propertyTester = new PropertyTests();
        ok=ok&&propertyTester.testGetAddress();
        ok=ok&&propertyTester.testGetPrice();
        PricesTests pricesTester = new PricesTests();
        ok=ok&&pricesTester.testGetPriceOneHouse();
        ok=ok&&pricesTester.testGetPriceArray();

        System.out.println(ok ? "All tests passed" : "At least one test failed");
    }
}