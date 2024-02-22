package Bit;
public class Twoprinterbitmanipulation {
    public static void main(String[] args) {
        int[] arr={7 , 21,8 ,9 ,16 ,23};
        int n=14;
        System.out.println(sub(arr, n));
        ase(arr, n);
    }
    public static void ase(int[]arr,int n ) {
        for(int i = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
        if (arr[i]+arr[j]==n) {
            int temp=arr[i];
             arr[i]=arr[j];
            arr[j]=temp;
    }
        }        
        
        System.out.print(arr[i]+", ");

    }
    }
    public static boolean sub(int[]arr,int n ) {
        for(int i = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){
        if (arr[i]+arr[j]==n) {
            return true;
        }
    }
        }
        return false;
    }
   

}
