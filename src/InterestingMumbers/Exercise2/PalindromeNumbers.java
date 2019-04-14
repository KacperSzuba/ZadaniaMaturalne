package InterestingMumbers.Exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PalindromeNumbers {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\59\\liczby.txt");
        List<String> listOfNumbers = Files.readAllLines(inputPath);
        int number,reverseNumber,sum,palindromeNumbers=0;
        for(int i=0;i<listOfNumbers.size();i++){
            number = Integer.parseInt(listOfNumbers.get(i));
            reverseNumber = Integer.reverse(number);
            sum = number+reverseNumber;
            if(sum==Integer.reverse(sum)){
                palindromeNumbers++;
            }
        }
        System.out.println(palindromeNumbers);
    }
}
