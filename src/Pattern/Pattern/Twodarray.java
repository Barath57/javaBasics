package Pattern.Pattern;

public class Twodarray {
   public static void main(String[] args) {
    //    int[][] twoDimArr = new int [5][3];

       int[][] twoDimArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15} };

        for (int i = 0; i < twoDimArray.length; i++) {
            int[] val = twoDimArray[i];
            for (int index = 0; index < val.length; index++) {
                System.out.print(twoDimArray[i][index] + " ");
            } 
            System.out.println();
        }
   } 

}
