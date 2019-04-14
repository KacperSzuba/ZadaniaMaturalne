package InterestingMumbers.Exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class powerOfTheNumber {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\59\\liczby.txt");
        List<String> listOfNumbers = Files.readAllLines(inputPath);
        int tab[] = new int[9];
        Set<Integer> onePowerNumbers = new TreeSet<>();
        for(int i=0;i<listOfNumbers.size();i++){
            int number =   Helper.powerCalculation(listOfNumbers.get(i));
            tab[number]++;
            if(number==1){
                onePowerNumbers.add(number);
            }
        }
    }
}
