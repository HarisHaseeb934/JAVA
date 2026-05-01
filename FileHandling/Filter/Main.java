package FileHandling.Filter;

import java.io.File;

class Main {
    public static void main(String args[]){
        File f = new File("C:\\Users\\Haris\\Desktop");
//        OnlyExt oe = new OnlyExt("ini");
//        String arr[] = f.list(oe);
//        String arr2[] = f.list();
//
//        for(String i : arr){
//            System.out.println(i);
//        }

        File arr3[] = f.listFiles();
        for( File f1 : arr3){
            System.out.println(f1.getName());
        }

    }
}
