package InterestingMumbers.Exercise3;

public class Helper {
    public static int powerCalculation(String number){
        int power=0,temp =1;
        while (number.length()>1){
            for(int i=0;i<number.length();i++){
                temp *= Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            number=String.valueOf(temp);
            temp =1;
            power++;
        }
        return power;
    }
}
