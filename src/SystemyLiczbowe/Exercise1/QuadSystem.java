package SystemyLiczbowe.Exercise1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class QuadSystem {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy2.txt");
        List<String> list = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int power = 1,temp=0,theLowest = Integer.MAX_VALUE;
        String result ="";
        for (int i=0;i<list.size();i++){
            String line = list.get(i);
            String[] tab = line.split(" ");
            for(int q=tab[1].length()-1;q>=0;q--){
                if (tab[1].charAt(q) != '0' && tab[1].charAt(q) != '-') {
                    temp += Integer.parseInt(String.valueOf(tab[1].charAt(q)))*power;
                    power *= 4;
                } else {
                    power *= 4;
                }
            }
            if(tab[1].startsWith("-")){
                temp *= -1;
            }
            if(temp<theLowest){
                theLowest = temp;
            }
            temp=0;
            power = 1;
        }
        if(theLowest<0){
            theLowest = theLowest*-1;
            String binaryNumber = Integer.toBinaryString(theLowest);
            String minus = "-";
            result = minus.concat(binaryNumber);
        }
        else {
            result= Integer.toBinaryString(theLowest);
        }
        System.out.println(result);

        Path outputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\Results\\QuadSystemResult.txt");
        Files.write(outputPath,result.getBytes());
    }
}
