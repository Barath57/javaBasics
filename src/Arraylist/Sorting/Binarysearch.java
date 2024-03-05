package Arraylist.Sorting;

public class Binarysearch {
    public static void main(String[] args) {
    System.out.println( );
    }
    public static int binarySearch(int[] array, int find) {

        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (find == array[middle]) {
                return middle;
            } else if (find > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
    
}
