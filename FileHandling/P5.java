package FileHandling;

import java.io.File;

public class P5 {
    public static void main(String args[]){
        File f = new File("C:\\Users\\Haris\\Desktop\\test.txt");
        if(f.delete()){
            System.out.println("Delete Successfully");
        }
    }
}
