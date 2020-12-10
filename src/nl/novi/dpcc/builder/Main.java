package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.House;
import nl.novi.dpcc.builder.domain.HouseBuilder;

public class Main {
    public static void main(String[] args) {
        House myHouse = new HouseBuilder()
                .withStreetName("Zonnedauwlaan")
                .withHouseNumber(24)
                .withHouseNumberAddition("")
                .withPostalCode("2465BC")
                .withProvince("Zuid-Holland")
                .withHasGarden(true)
                .build();


        House mySecondHouse = new HouseBuilder()
                .withStreetName("Zonnedauwlaan")
                .withHouseNumber(24)
                .withHouseNumberAddition("")
                .withPostalCode("2465BC")
                .withProvince("Zuid-Holland")
                .withHasGarden(true)
                .buildWithEmptyCheck();
    }
}