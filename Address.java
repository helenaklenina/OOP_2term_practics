package prac8;

public final class Address {
    private String cityName;
    private String streetName;
    private int zipCode;
    private int buildingNumber;
    private int apartmentNumber;
    private char buildingLetter;

    public Address(// Address ctor parametrs
                    String cityName, String streetName, int zipCode, int buildingNumber,
                   int apartmentNumber, char buildingLetter
            ) {// Address ctor init
        this.apartmentNumber = apartmentNumber;
        this.buildingLetter = buildingLetter;
        this.buildingNumber = buildingNumber;
        this.cityName = cityName;
        this.streetName = streetName;
        this.zipCode = zipCode;
    }
    // methods
    public String getCityName(){return this.cityName;}
    public String getStreetName(){return this.streetName;}
    public int getZipCode(){return this.zipCode;}
    public int getBuildingNumber(){return this.buildingNumber;}
    public int getApartmentNumber(){return this.apartmentNumber;}
    public char getBuildingLetter(){return this.buildingLetter;}

}


