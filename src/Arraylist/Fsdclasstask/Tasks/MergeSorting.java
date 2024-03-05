package Arraylist.Fsdclasstask.Tasks;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr={21,9,12,16,17,2,9};
        mergeSort(arr,0,arr.length -1);
        System.out.println("******************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
       public static void sort(int[] arr, int left, int right , int middle) {

         int n1size = middle - left+1;
         int n2size = right - middle;

         int leftArr[] = new int[n1size]; 
         int rightArr[] = new int[n2size];
         
        for (int i = 0; i < n1size; i++) {
            leftArr[i]=arr[left+i];
         }
         for (int j = 0; j < n2size; j++) {
            rightArr[j]=arr[middle + 1 + j];
         }
         int i = 0; int j = 0; int arrPosition = left;


         while (i<n1size && j<n2size) {
            if (leftArr[i] <= rightArr[j]){
                arr[arrPosition] = leftArr[i];
                i++;
            }
            else{
                arr[arrPosition] = rightArr[j];
                j++;
            }
            arrPosition++;
         }
         while (i<n1size) {
            arr[arrPosition] = leftArr[i];
            i++;
            arrPosition++;  
         }
         while (j<n2size) {
            arr[arrPosition] = rightArr[j];
            j++;
            arrPosition++;  
         } 
  }
	        public static int[] mergeSort(int[] arr, int left, int right){
                if(left < right) {
                int middle =(right+left)/2;
                System.out.println("Method call "+left+";"+right);
	           int[] rightFinal= mergeSort(arr,middle+1,right);
	           int[] leftFinal= mergeSort(arr,left,middle);
               sort(arr , left , right ,middle);
	           
	           System.out.println("Method return "+left+":"+right);
	        }
            return arr;
     }
}
