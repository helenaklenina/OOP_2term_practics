package prac8;

public final class Customer {
    private String firstName;
    private String secondName;
    private int age;
    private Address address;

    public Customer( // Customer ctor params
                    String firstName, String secondName, int age, Address address)
    {
        // Customer ctor init
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }
    // methods
    public String getFirstName(){return this.firstName;}
    public String getSecondName(){return this.secondName;}
    public int getAge(){return this.age;}
    public Address getAddress(){return this.address;}
}

