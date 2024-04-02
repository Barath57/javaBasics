package Task;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 10;
        patternsquare(n);
    }
      private static void patternsquare(int k){
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if((j == 0 || i == k-1 || j == k-1) || (i == j && i>k/2)||(j==k-i-1 && j>=k/2 ))
                System.out.print("* ");
            else
                System.out.print("  ");
            }
                System.out.println();
        }      
                    
     }
            
}
