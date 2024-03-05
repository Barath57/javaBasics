package Arraylist.Fsdclasstask.Tasks;

public class Recursiveloop {

    public static void main(String[] args) {

        int[] arr = {7,5,6,8,3,4};

        System.out.println("********** FOr ***********************");

        for(int i=0 ;i< arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("*************While ********************");
        int j=0;
        while (j< arr.length) {
            System.out.println(arr[j]);            
            j++;
        }

        System.out.println("*************Recursive ********************");
        Recursiveloop recursiveloop= new Recursiveloop();
        recursiveloop.loopcheck(arr, 0);

        
    }

    public void loopcheck(int[] arr, int i){
        if (i< arr.length) {
            System.out.println("Function call: "+arr[i]);            
            loopcheck(arr, i+1);
            System.out.println("Function return: "+arr[i]);            


        }
    }

 

}
