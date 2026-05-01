package FileHandling;

import java.io.File;

class P3 {
    public static void main(String args[]){
        File f = new File("C:\\Users\\Haris\\Desktop\\test.txt");
        System.out.println(f.exists() ? "Exists" : "Not Exists");
    }
}
