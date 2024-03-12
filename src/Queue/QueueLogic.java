package Queue;

public class QueueLogic<Q> {
    QueueNode<Q> head = null;
    QueueNode<Q> tail = null;
    int count=0;

    public int size(){
        return count;
    }

    public void enqueue(Q value){
        QueueNode<Q> current = new QueueNode<Q>(value);
      if (head == null) {
        head = current;
        tail = current;
      }
      else{
        tail.next = current;
        tail = current;
      }
      count++;
    }

    public void dequeue(){
        if (head != null) {
            head = head.next;
            count --;
        }

    }

    public void print(){
        QueueNode<Q> current = head;
        if (head != null) {
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }
        System.out.println("Size: "+count);
    }
}

