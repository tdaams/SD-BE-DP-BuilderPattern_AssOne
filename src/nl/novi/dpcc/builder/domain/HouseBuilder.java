package nl.novi.dpcc.builder.domain;

public class HouseBuilder {
    private String streetName;
    private int houseNumber = 0;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public HouseBuilder(String streetName, int houseNumber, String houseNumberAddition, String postalCode, String province, boolean hasGarden) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
        this.province = province;
        this.hasGarden = hasGarden;
    }

    public HouseBuilder(){

    }

    public HouseBuilder withStreetName(String streetName){
        this.streetName = streetName;
        return this;
    }

    public HouseBuilder withHouseNumber(int housenumber){
        this.houseNumber = housenumber;
        return this;
    }

    public HouseBuilder withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilder withPostalCode(String postalcode){
        this.postalCode = postalcode;
        return this;
    }

    public HouseBuilder withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilder withHasGarden(boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(streetName, houseNumber,houseNumberAddition,postalCode,province,hasGarden);
    }

    public House buildWithEmptyCheck(){
        if(postalCode == null ||postalCode.equalsIgnoreCase("")){
            throw new RuntimeException("Postalcode cannot be empty");
        }else if(streetName == null || streetName.equalsIgnoreCase("")){
            throw new RuntimeException("Streetname can not be empty");
        }else if(houseNumber == 0){
            throw new RuntimeException("House number cannot be zero");
        }
        return new House(streetName, houseNumber, houseNumberAddition,postalCode,province,hasGarden);
    }
}
