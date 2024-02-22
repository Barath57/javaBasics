package Pattern;

public class Arrayevenorodd {
    public static void main(String[] args) {
        {
            int a[] = { 5 , 10 , 15 , 20 , 25 , 30 , 35 , 40 };
            System.out.println(" even number ");
            for(int i : a)
            {
                if ( i % 2 == 0)
                {
                    System.out.println(i);
                }
                
            }
            System.out.println(" odd number");
            for ( int i : a){
                if ( i % 2 == 1)
                System.out.println(i);
            }
        }

    }
}
