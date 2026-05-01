package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class P6Count {
    public static void main(String args[]){
        int lineCount = 0;
        int wordCount = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\test.txt"))){
            String line;
            while((line = br.readLine()) != null){
                lineCount++;

                String[] word = line.trim().split("\\s+");
                if(!line.trim().isEmpty()){
                    wordCount += word.length;
                }
            }
        }catch (Exception e){
           System.out.println(e);
        }
        System.out.println(lineCount);
        System.out.println(wordCount);
    }
}
