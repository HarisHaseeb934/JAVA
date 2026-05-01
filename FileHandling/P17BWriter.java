package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class P17BWriter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String line;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Haris\\Desktop\\test3.txt", true))){
            System.out.println("Start writing ( Type 'exit to stop')");
            while(true){
                line = sc.nextLine();
                if(line.equalsIgnoreCase("exit")){
                    System.out.println("Stopped Writing");
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
