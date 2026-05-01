package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

class P16LongestLine {
    public static void main(String args[]){
        String line;
        int largestLine = 0;
        int secondLargest = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Haris\\Desktop\\test.txt"))){
            while((line = br.readLine()) != null){
                if(line.length() > largestLine){
                    secondLargest = largestLine;
                    largestLine = line.length();
                }else if(line.length() > secondLargest){
                    secondLargest = line.length();
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(largestLine);
        System.out.println(secondLargest);
    }
}
