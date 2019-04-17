package OctalNumbers.Exercise1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ExtremeNumbers {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\62\\liczby1.txt");
        List<String> list = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int theLowest=Integer.MAX_VALUE,theHighest=0,decimalNumber = 0,power =1,theHighestOctal = 0,theLowestOctal=0;
        for(int i=0;i<list.size();i++){
            for(int j=list.get(i).length()-1;j>=0;j--){
                decimalNumber +=Integer.parseInt(String.valueOf(list.get(i).charAt(j)))*power;
                power *=8;
            }
            if(decimalNumber>theHighest){
                theHighest = decimalNumber;
                theHighestOctal= Integer.parseInt(list.get(i));
            }
            if(decimalNumber<theLowest){
                theLowest = decimalNumber;
                theLowestOctal = Integer.parseInt(list.get(i));
            }
            decimalNumber =0;
            power =1;
        }
        System.out.println(theHighestOctal);
        System.out.println(theLowestOctal);
    }
}
