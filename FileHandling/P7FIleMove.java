package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P7FIleMove {
    public static void main(String args[]){
        try(FileReader fr = new FileReader("C:\\Users\\Haris\\Desktop\\test.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Haris\\Desktop\\test2.txt")){
            int ch;
            while((ch = fr.read()) != -1){
                fw.write(ch);
            }
            System.out.println("Successfully complete");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
