package SystemyLiczbowe.Zadanie1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SystemDwojkowy {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\dane_systemy1.txt");
        List<String> list = Files.readAllLines(inputPath, Charset.forName("UTF-8"));
        int power = 1,temp=0,theLowest = Integer.MAX_VALUE;
        String result ="";
        for (int i=0;i<list.size();i++){
            String line = list.get(i);
            String[] tab = line.split(" ");
            for(int q=tab[1].length()-1;q>0;q--){
                    if (tab[1].charAt(q) == '1') {
                        temp += power;
                        power *= 2;
                    } else {
                        power *= 2;
                    }
            }
            if(tab[1].startsWith("-")){
                temp *= -1;
            }
            if(temp<theLowest){
                theLowest = temp;
                 result = tab[1];
            }
            temp=0;
            power = 1;
        }
        System.out.println(theLowest);
        Path outputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\58\\wynik1.txt");
        Files.write(outputPath,result.getBytes());
    }
}
