package LinkedListPrograms.LinkedListCirucular;

public class CircularLinkedList {
       CLLPerson head = null;
    CLLPerson tail = null;
    
    public void insert(String name){
        CLLPerson person = new CLLPerson(name);
        if (head == null) {
            person.next=person;
            head = person;
            tail = person; 
        }
        else{
            person.next=head;
            tail.next = person;
            tail = person;
        }
    }

    public void print(){
        CLLPerson currentPerson = head;
        if (currentPerson != null) {
            do{
                System.out.println(currentPerson.name);
                currentPerson = currentPerson.next;
            }while (currentPerson != head);
            
        }
        else{
            System.out.println("List is empty");
        }
    }    
}



