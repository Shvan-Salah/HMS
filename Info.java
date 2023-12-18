package testhospital;

public class Info {
   final String name = "Bryar"+"Shvan"+"Shad";
   final String address;
   final String contact = "0773488 8293 - 0770110";

  public Info() {
        this.address = "iraq - Tish International University - Computer Engeenering Department";
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getContact() {
    return contact;
  }

  public void saveinfo() {
    System.out.println("Help");
  }
  
  public void displayinfo() {
    System.out.println(" Name: " + getName());
    System.out.println(getAddress() + "Address: ");
    System.out.println(getContact() + "Contact: ");
  }
}
