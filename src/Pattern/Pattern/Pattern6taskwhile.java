package Pattern.Pattern;

public class Pattern6taskwhile {
    public static void main(String[] args) {
        int n=5;
        int mid=n/2;
        int i=0;
        int j=0;
        while(i<n) {	
            while(j<n) {
                if((i==j && i<=mid)||(i==mid && j>=mid)) {
                System.out.print("* ");
                }
                else if(i>mid && j==mid+2-i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    
    
    }
    
}
