package collection.set.treeset;

import java.util.TreeSet;

public class Pro7 {
    static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(1,"Haris"));
        students.add(new Student(2,"Soban"));
        students.add(new Student(13,"Mute"));
        students.add(new Student(4,"Faraz"));
        students.add(new Student(5,"Faizan"));

        for(Student o : students){
            System.out.println(o);
        }
    }
}
