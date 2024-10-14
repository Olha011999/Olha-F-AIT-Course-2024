package homework_22;

public class Adress {

    private String city;
    private String postalCode;
    private String street;


    //constructor

    public Adress(String city, String postalCode, String street) {
        this.city = city;
        this.postalCode = postalCode;
        street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isSityValid(){
        return city != null && !city.isEmpty() && Character.isUpperCase(city.charAt(0));
    }

    public boolean isPostalCodeValid(){
        return postalCode != null && postalCode.matches("\\d{5}");//цифра должна повторяться 5 раз
    }

    public boolean isCityLetteraOnly(){
        return city != null && city.matches("[A-Za-z]+");//перебираем все буквы алфавита

    }

    public boolean isCityNameLengthValid(){
        return city != null && city.length() > 1;
    }

    public boolean isStreetValid(){
        return street != null && street.isEmpty() && Character.isUpperCase(street.charAt(0));
    }



}
