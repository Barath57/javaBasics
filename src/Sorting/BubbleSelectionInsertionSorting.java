package Sorting;

public class BubbleSelectionInsertionSorting {
    public static void main(String[] args) {
        int[] arr = {21,9,16,18,17,2};
        System.out.println("**********bobbleSort***********");
        int[] arr1=bobbleSort(arr);
        for(int i = 0; i<arr1.length; i++){
           System.out.println(arr1[i]);
        }
        System.out.println("**********selectionsort***********");
        int[] arr2=selectionsort(arr);
        for(int i = 0; i< selectionsort(arr).length; i++){
            System.out.println(arr2[i]);
    }
    System.out.println("**********insertionsort***********");
    int[] arr3=insertionsort(arr);
    for(int i = 0; i< insertionsort(arr).length; i++){
        System.out.println(arr3[i]);
}
}
    public static int[] insertionsort(int arr[] ) {
        for (int i = 0; i < arr.length; i++) {
            int currenVal = arr[i];
            int j = i - 1;
            while (j>=0 && arr[j] >currenVal) {
                arr[j+1] = arr[j];
                j--;
            } 

            arr[j+1] = currenVal; 
        }
        return arr;
}
    public static int[] selectionsort(int arr[] ) {
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
        for(int j = i+1; j<arr.length; j++){
        if (arr[j]<arr[minIndex]) {
          minIndex = j;
      }        
    }
    int temp=arr[i];
    arr[i]=arr[minIndex];
   arr[minIndex]=temp;
       }
        return arr;
    }

public static int[] bobbleSort(int arr[] ) {
    for(int i = 0; i<arr.length; i++){
    for(int j = i+1; j<arr.length; j++){
    if (arr[i]>arr[j]) {
        int temp=arr[i];
         arr[i]=arr[j];
        arr[j]=temp;
    }
  }  
    }
    return arr;
}
   
}

