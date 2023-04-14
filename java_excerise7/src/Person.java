public class Person{
    String surnameNguy63408,firstNameNguy63408,streetNguy63408,zipCodeNguy63408,cityNguy63408;
    public void init(String surnameNguy63408, String firstNameNguy63408, String streetNguy63408, String zipCodeNguy63408,
            String cityNguy63408) {
        this.surnameNguy63408 = surnameNguy63408;
        this.firstNameNguy63408 = firstNameNguy63408;
        this.streetNguy63408 = streetNguy63408;
        this.zipCodeNguy63408 = zipCodeNguy63408;
        this.cityNguy63408 = cityNguy63408;
    }
    public void print() {
        System.out.println("Surname: " + this.surnameNguy63408 +"\nFirst name: " + this.firstNameNguy63408
        + "\nStreet: "+ this.streetNguy63408 + "\nZip code: " + this.zipCodeNguy63408
        + "\nCity: " + this.cityNguy63408);
    }
}
class Staff extends Person{
    String educationNguy63408, positionNguy63408;
    
    public void init1(String surnameNguy63408, String firstNameNguy63408, String streetNguy63408, String zipCodeNguy63408,
            String cityNguy63408,String education, String position) {
        init(surnameNguy63408, firstNameNguy63408, streetNguy63408, zipCodeNguy63408, cityNguy63408);
        this.educationNguy63408 = education;
        this.positionNguy63408 = position;
    }

    public void print1() {
        print();
        System.out.println("Education: "+this.educationNguy63408  + "\nposision: " + this.positionNguy63408 );
    }

}
