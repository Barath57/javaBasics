package Queue;

public class QueueMain {
    public static void main(String[] args) {
        QueueLogic<String> queue = new QueueLogic<String>();
        queue.enqueue("Barath");
        queue.enqueue("kavin");
        queue.enqueue("suriya");
        queue.enqueue("suraj");
        queue.print();
        System.out.println("***************************");
        queue.dequeue();
        queue.print();
        System.out.println("*****************************");
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println("*****************************");
        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}
