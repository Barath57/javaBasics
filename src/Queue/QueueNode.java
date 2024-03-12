package Queue;

public class QueueNode<P> {
     P value;
    QueueNode<P> next = null;
    public QueueNode(P value){
        this.value = value;
    }
    
}
