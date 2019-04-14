package Dividers.Exercise1;

import java.io.IOException;
import java.lang.reflect.Parameter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NumbersBelowOneThousand {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("C:\\Users\\kacpe\\OneDrive\\Pulpit\\inf-pr-dane\\dane\\60\\liczby.txt");
        List<String> list = Files.readAllLines(inputPath);
        boolean areTheseTheLastTwo = false;
        int numbersBelowOneThousand = 0,temp=0;
        int tab[] = new int[2];
        for(int i=list.size()-1;i>0;i--){
            if((Integer.parseInt(list.get(i))<1000)&&temp!=2){
                tab[temp] = Integer.parseInt(list.get(i));
                temp++;
                numbersBelowOneThousand++;
            }
            else if(Integer.parseInt(list.get(i))<1000){
                numbersBelowOneThousand++;
            }
        }
        System.out.println(numbersBelowOneThousand);
        System.out.println(tab[0]);
        System.out.println(tab[1]);
    }
}
