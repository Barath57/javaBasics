package Arraylist;

import java.util.ArrayList;

import Oops.Encap.Person;

public class ArrayListObjects {
    public static void main(String[] args) {
        ArrayList<Person> alPerson = new ArrayList<Person>();
        Person p1 = new Person("vicky", "male", 24);
        Person p2 = new Person("xxxx","yyyy", 00);
        Person p3 = new Person("tamil", "english", 10);
        Person p4 = new Person(null, null, 0);
        p4.setAge(15);
        p4.setGender("male");
        
        p4.setAge("mettal");
        alPerson.add(p1);
        alPerson.add(p2);
        alPerson.add(p3);
        alPerson.add(p4);
        alPerson.add(new Person("sindhe","fimale",17));

// for (Person person : alPerson){}

// for (int i = 0; i < alPerson.size(); i++) {
//     Person person = alPerson.get(i);}
        
        alPerson.forEach(person->{
            System.out.println("");
            System.out.println("name : "+person.getAge());
            System.out.println("gender: "+person.GetGender());
            System.out.println("age : "+person.getAge());
        });
    }


    public static ArrayList<alPerson> sort (ArrayList<alPerson>alPersons){
        for (int i = 0; i <alPersons.size(); i++) {
            for (int j = 0; j <alPersons.size(); j++) {
                if (alPersons.get(i).getName().compareTo(alPersons.get(j).getName())); {
                   alPerson temp=alPersons.get(i);
                    alPersons.set(i,alPersons.get(j));
                    alPersons.set(j,temp);
                }
                
            }
            
        }
        return alPersons;
    }

    
}
