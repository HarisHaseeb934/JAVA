package collection.list.arrayList;

public class Student {
    private String name;
    private String fatherName;
    private int age;
    private String course;

    public Student(String name, String fatherName, int age, String course) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.course = course;
    }

    public String toString(){
        return " Name : " + name + "," + " Father Name : " + fatherName + "," + " Age : " + age + "," + " Course : " + course + "\n";
    }
}
