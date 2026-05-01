package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class P17CopyFile {
    public static void main(String args[]){
        try(BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\source.txt"));
            BufferedWriter bw =new BufferedWriter(new FileWriter("C:\\Users\\Haris\\Desktop\\test.txt")) ) {
                String line;
                while( (line = br.readLine()) != null){
                    System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println("Copied");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
