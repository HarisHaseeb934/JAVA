package FileHandling;

import java.io.*;

public class P2BufferedRead {
    public static void main(String args[]) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\test.txt"))){
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
