package FileHandling.dir;

import java.io.File;

public class Main {
    public static void main(String args[]){
        File f = new File("C:\\Users\\Haris\\Desktop\\newDir\\file\\new");
//        if(f.mkdir()){
//            System.out.println("Success Fully Created");
//        }else{
//            System.out.println("CAnnot Created");
//        }

        if(f.mkdirs()){
            System.out.println("Success Fully Created");
        }else{
            System.out.println("CAnnot Created");
        }
    }
}
