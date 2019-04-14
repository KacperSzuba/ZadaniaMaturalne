package NumberSystems.Exercise4;

import NumberSystems.Exercise2.ChangeNumberSystem;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class TemperatureDifference {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy1.txt");
        List<String> list = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        List<String> listOfTemperatures = new ArrayList();
        for (String str:list
             ) {
            String tab[] = str.split(" ");
            listOfTemperatures.add(tab[1]);
        }

        ChangeNumberSystem changeNumberSystem = new ChangeNumberSystem();
        int startNumber1 = changeNumberSystem.change(2,listOfTemperatures.get(0));
        int startNumber2 = changeNumberSystem.change(2,listOfTemperatures.get(1));
        double temperatureDifferenceRecord = Math.ceil((Math.pow((startNumber1-startNumber2),2))/Math.abs(0-1));
        double temp;
        for(int i =0;i<list.size();i++){
            for(int j=1;j<list.size();j++){
                startNumber1 = changeNumberSystem.change(2,listOfTemperatures.get(i));
                startNumber2 = changeNumberSystem.change(2,listOfTemperatures.get(j));
                temp = Math.ceil((Math.pow((startNumber1-startNumber2),2))/Math.abs(i-j));
                if(temp>temperatureDifferenceRecord){
                    temperatureDifferenceRecord = temp;
                }
            }
        }
        System.out.println(temperatureDifferenceRecord);
    }
}
