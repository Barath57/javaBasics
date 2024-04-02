package Oops.Encap;

public class Person {
    String firstName, lastName, salutation, gender , ssn , address , zip , phone , dob , bloodGroup ;
    String age;
    public Person(String firstName,String lastName, int i){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSalutation() {
        return salutation;
    }
    public String GetGender(){
        return gender;
    }
    public String getSsn() {
        return ssn;
    }
    public String getAddress() {
        return address;
    }
    public String getZip() {
        return zip;
    }
    public String getAge() {
        return age;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public String getDob() {
        return dob;
    }
    public String getPhone() {
        return phone;
    }
}