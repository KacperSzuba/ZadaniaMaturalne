package Dividers.Exercise2;


import java.util.TreeSet;

public class NumberOfDividers {

    public TreeSet<Integer> getSet() {
        return set;
    }

    TreeSet<Integer> set = new TreeSet<>();
    public int howManyDivisors(String number){
        int result = 0;
            for(int i=1;i<=Integer.parseInt(number);i++){
                if(Integer.parseInt(number)%i==0){
                    set.add(i);
                    result++;
                }
            }
        return result;
    }
    public void clearSet(){
        set.clear();
    }
}
