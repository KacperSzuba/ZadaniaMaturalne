package OctalNumbers.Exercise3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ComparisonOfValues {
    public static void main(String[] args) throws IOException {
        Path inputPath1 = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\62\\liczby1.txt");
        Path inputPath2 = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\62\\liczby2.txt");
        List<String> list1 = Files.readAllLines(inputPath1, Charset.forName("UTF-8"));
        List<String> list2 = Files.readAllLines(inputPath2, Charset.forName("UTF-8"));
        int decimalNumber=0,power=1,equalNumbers=0,biggerNumbers=0;
        for(int i=0;i<list1.size();i++){
            for(int j=list1.get(i).length()-1;j>=0;j--){
                decimalNumber +=Integer.parseInt(String.valueOf(list1.get(i).charAt(j)))*power;
                power *=8;
            }
                if(decimalNumber==Integer.parseInt(list2.get(i))){
                    equalNumbers++;
                }
                else if(decimalNumber>Integer.parseInt(list2.get(i))){
                    biggerNumbers++;
                }
            decimalNumber =0;
            power =1;
        }
        System.out.println(equalNumbers);
        System.out.println(biggerNumbers);
    }
}
