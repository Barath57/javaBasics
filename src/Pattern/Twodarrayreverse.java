package Pattern;

public class Twodarrayreverse {
    public static void main(String[] args) {
        int[][] twoDimArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15} };

        for (int i = twoDimArray.length-1; i >= 0; i--) {
            int[] val = twoDimArray[i];
            for (int j= val.length-1;j >= 0; j--) {
                System.out.print(" " + twoDimArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void rowcolreverse(int [][] arr) 
    {
       for (int i = arr.length-1; i >=0; i++) {
        int[] row = arr[i];
        for(int j=row.length - 1; j >= 0; j--){
            System.out.print(" "+row[j]);
        }
        System.out.println();
        
       } 
    }
    
}



 
