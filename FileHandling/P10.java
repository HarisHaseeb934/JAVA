package FileHandling;

import java.io.File;
import java.util.Scanner;

public class P10 {
    public static void main(String args[]){
        File f1 = new File("C:\\Users\\Haris\\Desktop");
        if(f1.isDirectory()){
            String list[] = f1.list();
            for(String str : list){
                System.out.println(str);
            }
        }
        System.out.print("Enter Your File Name : ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        File f = new File("C:\\Users\\Haris\\Desktop\\" + fileName);
        if(f.exists()){
            System.out.println("Exists");
        }
    }
}
