package Oops.Abstraction;

public class AbstractionMain {
    private static final String Null = null;

    public static void main(String[] args) {
        GrandMother grandMother=new GrandMother(Null) {
            return Null;

            @Override
            String getAge(String dob) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getAge'");
            }
            
        
        };
    }
    
}
