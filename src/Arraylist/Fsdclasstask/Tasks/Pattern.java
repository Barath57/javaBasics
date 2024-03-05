package Arraylist.Fsdclasstask.Tasks;

public class Pattern {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // Pattern3(5);
       // Pattern4(5);
      pattern5(5);
         pattern6(5);
    }
        
   

   


    public static void pattern1(int n) {
           int k=n;
        for (int i = 0; i < n; i++) {
            k--;

            for (int j = 0; j < n; j++) {
                if ((j==0 || j==n-1) || (i==0 || i==n-1) || (j==i || j==k)) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
                
            }System.out.println();
            
        }
   }
    

    public static void pattern2(int n) {
        int k = n;
        for (int i = 0; i < n; i++) {
            k--;
            for (int j = 0; j < n; j++) {
                if ((j==0 || i==n-1 || j==k)) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }System.out.println();
            
        }
    }
    public static void Pattern3(int n) {
       
        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n; j++) {
                if (j==0 || i==n-1 ||  i+j==n-1) {
                    System.out.print(" *");
                    
                }
                else{
                    System.out.print("  ");
                }
                
            }System.out.println();
            
        }

        
    }

    public static void Pattern4(int n) {
       
        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n; j++) {
                if (j==0 ||i==0 ||i==n-1||j==n-1) {
                    System.out.print(" *");
                    
                }
                else{
                    System.out.print("  ");
                }
                
            }System.out.println();
            
        }

        
    }

    public static void pattern5(int n) {
        int i = 0;
        while(i<n){
        int j=0; 
        while(j<n) {
            if (j==0 ||i==0 ||i==n-1||j==n-1) {
                System.out.print(" *");     
            }
            else{
                System.out.print("  ");
            }
            j++;     
        } i++;
        System.out.println(); 
     } 
  }
       
     
    public static void pattern6(int n) {
        int i = 0;
        while(i<n){
        int j=0; 
        while(j<n) {
            if (j==0 || i==n-1 ||  i+j==n-1){
                System.out.print(" *");     
            }
            else{
                System.out.print("  ");
            }
            j++;     
        } 
        i++;
        System.out.println(); 
     } 
  }
}  
  
 
             
    



   
        

        


    

    

