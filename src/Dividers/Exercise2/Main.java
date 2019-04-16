package Dividers.Exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\60\\liczby.txt");
        List<String> list = Files.readAllLines(inputPath);
        NumberOfDividers numberOfDividers = new NumberOfDividers();
        for(int i=0;i<list.size();i++){
            if(numberOfDividers.howManyDivisors(list.get(i))==18){
                System.out.println(list.get(i)+": "+numberOfDividers.getSet());
                numberOfDividers.clearSet();
            }
        }
    }
}
