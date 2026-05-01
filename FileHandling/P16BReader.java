package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

class P16BReader {
    public static void main(String args[]){
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\test.txt"))){
            String line;
            int lineno = 0;
            while((line = br.readLine()) != null){
                System.out.println(lineno + " : " + line);
                lineno++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
