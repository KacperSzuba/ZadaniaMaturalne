package NumberSystems.Exercise2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path binaryInputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy1.txt");
        Path quadInputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy2.txt");
        Path octalInputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy3.txt");
        List<String> binaryNumbers = Files.readAllLines(binaryInputPath, Charset.forName("UTF-8"));
        List<String> quadNumbers = Files.readAllLines(quadInputPath, Charset.forName("UTF-8"));
        List<String> octalNumbers = Files.readAllLines(octalInputPath, Charset.forName("UTF-8"));

        ChangeNumberSystem changeNumberSystem = new ChangeNumberSystem();

        int numberOfBadMeasurements = 0;
        for(int i=0;i<binaryNumbers.size();i++){
            String binaryNumber = binaryNumbers.get(i);
            String tab[] = binaryNumber.split(" ");
            String quadNumber =quadNumbers.get(i);
            String tab2[] = quadNumber.split(" ");
            String octalNumber = octalNumbers.get(i);
            String tab3[] = octalNumber.split(" ");
            if((12+(24*i)!=changeNumberSystem.change(2,tab[0]))&& (12+(24*i)!=changeNumberSystem.change(4,tab2[0])) && (12+(24*i)!=changeNumberSystem.change(8,tab3[0]))){
                numberOfBadMeasurements++;
            }
        }
        System.out.println(numberOfBadMeasurements);
    }
}
