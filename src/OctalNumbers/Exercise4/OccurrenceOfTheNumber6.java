package OctalNumbers.Exercise4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OccurrenceOfTheNumber6 {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\62\\liczby2.txt");
        List<String> list = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int decimal6Frequency=0,octal6Frequency=0;
        for(int i=0;i<list.size();i++){
            for (int j=0;j<=list.get(i).length()-1;j++){
                if(Integer.parseInt(String.valueOf(list.get(i).charAt(j)))==6){
                    decimal6Frequency++;
                }
            }
        }
        for(int i=0;i<list.size();i++){
            String octalNumber = Integer.toOctalString(Integer.parseInt(list.get(i)));
            for (int j=0;j<=octalNumber.length()-1;j++){
                if(Integer.parseInt(String.valueOf(octalNumber.charAt(j)))==6){
                    octal6Frequency++;
                }
            }
        }
        System.out.println(decimal6Frequency);
        System.out.println(octal6Frequency);
    }
}
