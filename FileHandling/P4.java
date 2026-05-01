package FileHandling;

import java.io.*;

public class P4 {
    public static void main(String args[]){
//        try(BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\Haris\\Desktop\\test.txt", true))){
//            br.write("Department is Computing\n");
//            br.write("Course is SE");
//        }catch(Exception e){
//            System.out.println(e);
//        }
        try(BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\test.txt"))){
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
