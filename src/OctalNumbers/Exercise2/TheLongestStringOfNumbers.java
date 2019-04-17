package OctalNumbers.Exercise2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TheLongestStringOfNumbers {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\62\\liczby2.txt");
        List<String> list = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int temp=1,tempFirstElement=0,theLongestStringOfNumbers=0,firstElement=0;
        for(int i=1;i<list.size();i++){
            if(Integer.parseInt(list.get(i))>=Integer.parseInt(list.get(i-1))){
                if(tempFirstElement==0){
                    tempFirstElement = Integer.parseInt(list.get(i-1));
                }
                temp++;
            }
            else {
                if(temp>theLongestStringOfNumbers){
                    theLongestStringOfNumbers = temp;
                    firstElement = tempFirstElement;
                }
                temp=1;
                tempFirstElement=0;
            }
        }
        System.out.println(theLongestStringOfNumbers);
        System.out.println(firstElement);
    }
}
