package simple.hr;

public class Address {
    private String street;
    private String city;
    private String province;
    private String zipCode;

    public Address(String st, String cty, String prov, String zip){
        this.city = cty;
        this.street = st;
        this.province = prov;
        this.zipCode = zip;
    }

    public void getAddress(){
        System.out.println(
                "Street: " + street
                + "\nCity: " + city
                + "\nProvince: " + province
                +"\nZip: " + zipCode
        );
    }



}
