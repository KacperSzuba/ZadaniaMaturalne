package ArithmeticSequences.Exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\61\\ciagi.txt");
        List<String> list = Files.readAllLines(inputPath);
        List<String> listOfCubicRoot = new ArrayList<>();
        for (int i=1;i<list.size();i+=2){
            String line = list.get(i);
            String tab[] = line.split(" ");
            for(int j=tab.length-1;j>=0;j--){
                double number = Math.cbrt(Integer.parseInt(tab[j]));
                if(Integer.parseInt(tab[j])%number==0){
                    listOfCubicRoot.add(tab[j]);
                    break;
                }
            }
        }
        System.out.println(listOfCubicRoot);
    }
}
