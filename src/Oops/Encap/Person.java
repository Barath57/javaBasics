package Oops.Encap;

public class Person {
    String firstName, lastName, salutation, gender , ssn , address , zip , phone , dob , bloodGroup ;
    String age;
    public Person(String firstName,String lastName, int i){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public Person(String string, String string2) {
        //TODO Auto-generated constructor stub
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
    public void setAge(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }
    public void setBloodGroup(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBloodGroup'");
    }
    public void setGender(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGender'");
    }
    public void setAge(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAge'");
    }
}
