package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class P13FileReader {
    public static void main(String args[]){
        int count = 0;
        try(FileReader fr = new FileReader("C:\\Users\\Haris\\Desktop\\test.txt")){
            int ch = 0;
            while((ch = fr.read()) != -1){
                if(Character.isWhitespace(ch)){
                    continue;
                }
                System.out.print((char)ch);
                count++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Total Character are : " + count);
    }
}
