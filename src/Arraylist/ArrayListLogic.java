package Arraylist;

import java.util.ArrayList;

public class ArrayListLogic {
        private static final Boolean flase = null;
        ArrayList<Integer>array;
        public ArrayListLogic(ArrayList<Integer> arr);public ArrayListLogic() {
            //TODO Auto-generated constructor stub
        }
        {
        ArrayList<Integer> arr;
        array = arr;
    }
    public ArrayList<Integer> oddArray(){
        return oddAndEven(true);
    }
    public ArrayList<Integer> evenArray(){
        return oddAndEven(flase);
    }

    public ArrayList<Integer> oddAndEven(Boolean flase2){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            if(oddAndEven(array.get(i)) && flase2)
            res.add(array.get(i)); 
        }
        else if (!flase2 && !oddAndEven(array.get(flase2))) {
            res.add(array.get(flase2));
        }
    }
    private boolean oddAndEven(Integer integer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'oddAndEven'");
    }
}
