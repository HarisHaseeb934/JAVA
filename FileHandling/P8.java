package FileHandling;

import java.io.File;
import java.util.Scanner;

public class P8 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(new File("C:\\Users\\Haris\\Desktop\\test.txt"))){
            int lineno = 0;
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(lineno + " " + line);
                lineno++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
