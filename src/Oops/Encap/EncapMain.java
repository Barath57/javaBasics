package Oops.Encap;

public class EncapMain {
    public static void main(String[] args) {
        Person person = new Person("Ranjith","kumal");
         

        person.setAge("49");
        person.setGender("male");
        person.setBloodGroup("A1B-ve");
        String name  = person.getFirstName()+""+person.getLastName()+","+person.getAge()+"/"+person.getBloodGroup();
    }  
}
