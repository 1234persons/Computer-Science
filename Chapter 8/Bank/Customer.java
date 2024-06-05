package Bank;

public class Customer {
   private String fName, lName, street, city, state, zip;

   /*
    * constructor
    * Customer data made
    */

   public Customer(String fName, String lName, String street, String city, String state, String zip) {
      this.fName = fName;
      this.lName = lName;
      this.street = street;
      this.city = city;
      this.state = state;
      this.zip = zip;
   }

   public String toString() {
      String custString = fName + " " + lName + "\n";
      custString += street + "\n";
      custString += city + ", " + state + ", " + zip + "\n";
      return (custString);
   }

   public void changeStreet(String street) {
      this.street = street;
   }
   public void changeCity(String city) {
      this.city = city;
   }

   public void changeState(String state) {
      this.state = state;
   }

   public void changeZip(String zip) {
      this.zip = zip;
   }

}
