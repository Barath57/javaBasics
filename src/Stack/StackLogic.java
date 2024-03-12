package Stack;

public class StackLogic<T> {
     
    StackNode<T> first=null;
    StackNode<T> last=null;

    public void push(T value){
        StackNode<T> current = new StackNode<T>(value);
        if (first == null) {
            first = current;
            last = current;
        }
        else{
            last.next = current;
            last = current;
        }
    }

    public void pop(){
        if (first != null) {
            StackNode<T> current = first;
            while (current != null) {
                if (current.next == last) {
                    current.next = null;
                    last = current;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    public void print(){
        if (first != null) {
            StackNode<T> current = first;
            while (current != null) {
              System.out.println(current.value);  
              current = current.next;
           }
        }
    }
}
