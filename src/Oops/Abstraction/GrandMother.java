package Oops.Abstraction;

public abstract class GrandMother {
    String name;
    public GrandMother(String null1) {
        //TODO Auto-generated constructor stub
    }
    void setName(String name){
        this.name = name ;
    }
     String getName(){
        return name;
     }
     abstract String getAge(String dob);
}
