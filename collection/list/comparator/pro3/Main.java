package collection.list.comparator.pro3;

import Interfaces.Conflict.A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(23,"Haris", 3.41));
        students.add(new Student(9,"Faraz", 3.46));
        students.add(new Student(8,"Sahar", 3.99));
        students.add(new Student(8,"Huzefa", 3.77));
        students.add(new Student(12,"Faizan", 3.47));

//        for(Student s : students){
//            System.out.println(s);
//        }
        // Sort by Marks
        students.sort((s1,s2)->{
            if(s2.getMarks() - s1.getMarks() > 0){
                return 1;
            }else if(s2.getMarks() - s1.getMarks() < 0){
                return -1;
            }else{
                return 0;
            }
        });
        // Sort by Name
        students.sort((s1,s2)->{
            if(s1.getName().length() - s2.getName().length() > 0){
                return 1;
            }else if(s1.getName().length() - s2.getName().length() < 0){
                return -1;
            }else{
                return 0;
            }
        });
        // Sort by Id
        students.sort((s1,s2)->{
            if(s1.getId() - s2.getId() > 0){
                return 1;
            }else if(s1.getId() - s2.getId() < 0){
                return -1;
            }else{
                return 0;
            }
        });

        for(Student s : students){
            System.out.println(s);
        }

    }
}
