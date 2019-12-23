package question5;

public class Address {

    private String address;
    private String zipCode;

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    public Address(){
        super();
    }

    public Address(String address,String zipCode){
        super();
        this.address = address;
        this.zipCode = zipCode;

    }
}
