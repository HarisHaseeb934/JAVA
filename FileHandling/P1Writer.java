package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

class P1Writer {
    public static void main(String args[]){
        try(FileWriter fw = new FileWriter("C:\\Users\\Haris\\Desktop\\test.txt");){
            fw.write("My name is Haris\n");
            fw.write("study in Emerson University");
        }catch(IOException e){
            System.out.println(e);
        }

    }
}
