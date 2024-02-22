package Pattern.Pattern;
import java.util.Scanner;
public class patternprintreverse {
    public static void main(String[] args) {
        System.out.println("Enter string : ");
        try (Scanner s = new Scanner(System.in)) {
            String s1=s.next();
             for(int i=0;i<s1.length();i++){
                    for(int j=0;j<s1.length();j++){
                        if(i==j){
                            System.out.print(s1.charAt(i));
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
        }

         }
}
