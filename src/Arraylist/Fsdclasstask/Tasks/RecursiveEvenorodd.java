package Arraylist.Fsdclasstask.Tasks;
public class RecursiveEvenorodd {
    public static void main(String[] args) {
        int[] arr = {4,7,23,45,76,83,91,49};
        RecursiveEvenorodd recursiveLoop = new RecursiveEvenorodd();
        recursiveLoop.even_num(arr, 0);
        System.out.println("Even Numbers: ");
          
    }
    public void even_num(int[] arr, int i){
        if (i< arr.length) {
            if(arr[i] %2 ==1)
                System.out.println("even numbers : "+arr[i]);
            even_num(arr, i+1);
        }
        return;
    }
}