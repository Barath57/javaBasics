package Arraylist.Fsdclasstask.String;

public class Twosquare {
    public static void main(String[] args) {
        
    String str = "Hello World All";
    String str1 = "Hello World";
    logic(str);
    System.out.println("**************************");
    logic(str1);
    
    }


    public static void logic(String s) {
        String[] sArr = s .split(" ");
        for(int i = 0; i < sArr.length;i++){
        for (int j = 0; j < sArr.length - i; j++) {
            System.out.print(" "+sArr[i]);
        }
        System.out.println();
    }
}
}
