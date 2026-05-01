package FileHandling;

import java.io.FileWriter;

class P15FileWriter {
    public static void main(String args[]){
        try(FileWriter fw = new FileWriter("C:\\Users\\Haris\\Desktop\\test.txt",true)){
            fw.write("\nDepartment is Computing\n");
            fw.write("Course is Software Engineering\n");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
