package Pattern;

public class Mainmethod {
    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 2, 9 };
        recursive(arr, 0);
        int j = arr.length-1;

        rev(arr,j);
    }

    public static int recursive(int[] arr, int i) {
        if (i < arr.length) {
            System.out.println(arr[i] + " ");
            recursive(arr, i + 1);

        }
        return i;
    }

public static int rev(int[] arr , int j ){
    if(j>= 0 ){
        System.out.println(arr[j] + " ");
         return rev(arr,--j);
         
    }  
    return j ;
}
}
