package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Display {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> id = new HashMap<>();
        boolean value = true;
        while (value){
            System.out.println("*** Choose Option ***");
            System.out.println("1: Create Account");
            System.out.println("2: Login");
            System.out.println("3: Exit");
            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1 :
                    System.out.println("*** Create Account ***");
                    System.out.print("Enter Your Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter your Password : ");
                    String pass = sc.nextLine();
                    id.put(name,pass);
                    break;
                case 2:
                    System.out.println("*** Login ***");
                    System.out.print("Enter Your Name : ");
                    String n = sc.nextLine();
                    System.out.print("Enter your Password : ");
                    String p = sc.nextLine();
                    for(Map.Entry<String,String> m : id.entrySet()){
                        if(id.containsKey(m.getKey()) && id.get(m.getKey()).equals(m.getValue())){
                            System.out.println("Login");
                        }else{
                            System.out.println("Failed");
                        }
                    }
                    break;
                case 3:
                    value = false;
            }
        }
    }
}
