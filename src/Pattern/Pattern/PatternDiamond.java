package Pattern.Pattern;
public class PatternDiamond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <=n; i++){
            
            for (int k = n; k < i; k--){
                System.out.print("");
            }
            for (int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
        

            }
        }
    }
    
    

