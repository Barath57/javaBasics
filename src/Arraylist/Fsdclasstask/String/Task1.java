package Arraylist.Fsdclasstask.String;

public class Task1 {
    public static void main(String[] args) {
        String str="Hello World";
        logicreplace(str);
        System.out.println("********");

        String str1="Hello World";
        logicreverse(str1);
        System.out.println("********");
        
        String str2="Hello_ _ _World";
        logicspace(str2);
        System.out.println("********");
        
    }
    public static void logicreplace(String s) {
      System.out.println(s.replace("World","all")+" ");
            
        }

        public static void logicreverse(String s) {
            String[] sArr = s .split(" ");
            for (int i = sArr.length-1;i>=0;i--) {
                 System.out.print(sArr[i]+" ");
                }
                
            }



        public static void logicspace(String s) {
                    System.out.print(s.replace(" ","_ _ _")+" ");
                }
                
             } 
        
            
        
        
    
    

