package LinkedListPrograms.LinkedListBdouble;

public class DoubleLinkedList {
    DLLPerson head;
    DLLPerson tail;
     
    public void insert(String name){
        DLLPerson person = new DLLPerson(name);
           
           if (head == null) {
            head = person;
            tail = person;
           }
           else{
            tail.connectNext = person;
            person.connectprev=tail;
            tail = person;
           }
    }
     
    public void print(){
        DLLPerson currentPerson = head;
        while (currentPerson != null) {
            System.out.println(currentPerson.name);
            currentPerson = currentPerson.connectNext;
            
        }
    }
    
}
