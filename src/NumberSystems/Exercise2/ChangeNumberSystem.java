package NumberSystems.Exercise2;

public class ChangeNumberSystem {

    public int change(int numberSystem,String number){
        int result = 0;
        int power =1;
        for(int i=number.length()-1;i>=0;i--){
            try {
                if (number.charAt(i) != '0') {
                    result += Integer.parseInt(String.valueOf(number.charAt(i))) * power;
                    power *= numberSystem;
                } else {
                    power *= numberSystem;
                }
            }
            catch (NumberFormatException exception){
                if(number.charAt(0)=='-'){
                    result = result *-1;
                }
            }
        }
        return result;
    }
}
