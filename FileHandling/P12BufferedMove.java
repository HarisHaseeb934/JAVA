package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class P12BufferedMove {
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\test.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Haris\\Desktop\\test2.txt"))){

            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }
            String str = sb.toString();
            bw.write(str);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
