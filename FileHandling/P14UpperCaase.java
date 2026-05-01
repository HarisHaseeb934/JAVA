package FileHandling;

import java.io.FileReader;

public class P14UpperCaase {
    public static void main(String args[]){
        char[] buffer = new char[1024];
        try(FileReader fr = new FileReader("C:\\Users\\Haris\\Desktop\\test.txt")){
            int n = fr.read(buffer);
            String text = new String(buffer , 0, n);
            System.out.println(text.toUpperCase());
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
