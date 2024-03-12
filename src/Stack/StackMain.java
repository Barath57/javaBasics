package Stack;

public class StackMain {
    public static void main(String[] args) {
        StackLogic<String> obj = new StackLogic<String>();
        obj.push("Dhinakar");
        obj.push("sanjay");
        obj.push("Suraj");
        obj.push("Kavin");
        obj.print();
        System.out.println("******************");
        obj.pop();
        obj.print();

        StackLogic<Integer> obj1 = new StackLogic<Integer>();
        obj1.push(23);
        obj1.push(25);
        obj1.push(27);
        obj1.push(29);
        obj1.print();
        System.out.println("******************");
        obj1.pop();
        obj1.pop();
        obj1.print();
    }  
}
