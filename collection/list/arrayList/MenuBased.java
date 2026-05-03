package collection.list.arrayList;

import Interfaces.Conflict.A;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBased {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean value = true;
        while(value){

            System.out.println("1: Enter Student Details");
            System.out.println("2: See Student Details");
            System.out.println("3: Exit");

            int option = sc.nextInt();
            sc.nextLine();

                switch(option){
                    case 1:
                        System.out.print("Enter your Name : ");
                        String name = sc.nextLine();
                        System.out.print("Enter your Father Name : ");
                        String fatherName = sc.nextLine();
                        System.out.print("Enter your Age : ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter your Course : ");
                        String course = sc.nextLine();
                        students.add(new Student(name, fatherName,age, course));
                        break;
                    case 2:
                        System.out.println(students);
                        break;
                    case 3:
                        value = false;
                        break;
                    default:
                        System.out.println("Choose Valid Option");
                }
        }
    }
}
