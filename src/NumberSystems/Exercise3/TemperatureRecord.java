package NumberSystems.Exercise3;

import NumberSystems.Exercise2.ChangeNumberSystem;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TemperatureRecord {
    public static void main(String[] args) throws IOException {
        Path binaryInputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy1.txt");
        Path quadInputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy2.txt");
        Path octalInputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy3.txt");

        List<String> binaryNumbers = Files.readAllLines(binaryInputPath, Charset.forName("UTF-8"));
        List<String> quadNumbers = Files.readAllLines(quadInputPath, Charset.forName("UTF-8"));
        List<String> octalNumbers = Files.readAllLines(octalInputPath, Charset.forName("UTF-8"));

        ChangeNumberSystem changeNumberSystem = new ChangeNumberSystem();

        String binaryNumber = binaryNumbers.get(0);
        String quadNumber =quadNumbers.get(0);
        String octalNumber = octalNumbers.get(0);
        String tab[] = binaryNumber.split(" ");
        String tab2[] = quadNumber.split(" ");
        String tab3[] = octalNumber.split(" ");

        int binaryRecord= changeNumberSystem.change(2,tab[1]);
        int quadRecord = changeNumberSystem.change(4,tab2[1]);
        int octalRecord = changeNumberSystem.change(8,tab3[1]);
        int tempBinary,tempQuad,tempOctal;
        int numberOfRecordDays =1;
        for(int i=1;i<binaryNumbers.size();i++){
            boolean isRecord = false;
            binaryNumber = binaryNumbers.get(i);
            quadNumber =quadNumbers.get(i);
            octalNumber = octalNumbers.get(i);
            String tab4[] = binaryNumber.split(" ");
            String tab5[] = quadNumber.split(" ");
            String tab6[] = octalNumber.split(" ");
            tempBinary = changeNumberSystem.change(2,tab4[1]);
            tempQuad = changeNumberSystem.change(4,tab5[1]);
            tempOctal = changeNumberSystem.change(8,tab6[1]);
            if(tempBinary>binaryRecord){
                binaryRecord = tempBinary;
                isRecord = true;
            }
            else if(tempQuad>quadRecord){
                quadRecord = tempQuad;
                isRecord = true;
            }
            else if(tempOctal>octalRecord){
                octalRecord = tempOctal;
                isRecord = true;
            }
            if(isRecord){
                numberOfRecordDays++;
            }
        }

        System.out.println(numberOfRecordDays);
    }
}
