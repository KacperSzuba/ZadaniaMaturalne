package ArithmeticSequences.Exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.TreeSet;

public class CalculatingTheDifferenceOfSequences {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\61\\ciagi.txt");
        List<String> list = Files.readAllLines(inputPath);
        int numberOfSequences = 0,r=0;
        TreeSet<Integer> sequenceDifferences = new TreeSet<>();
        boolean isItSequence = true;
        for(int i=1;i<list.size();i+=2){
            String line = list.get(i);
            String tab[] = line.split(" ");
            for(int j=1;j<tab.length;j++){
                r = Integer.parseInt(tab[1]) - Integer.parseInt(tab[0]);
                if ((Integer.parseInt(tab[j]) - Integer.parseInt(tab[j-1]) == r)) {
                    isItSequence = true;
                }
                else {
                    isItSequence = false;
                    break;
                }
            }
            if(isItSequence){
                numberOfSequences++;
                sequenceDifferences.add(r);
            }
        }
        System.out.println(numberOfSequences);
        System.out.println(sequenceDifferences.last());
    }
}
