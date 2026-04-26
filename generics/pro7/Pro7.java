package generics.pro7;

public class Pro7 {
    public static void main(String[] args) {
        Student st1 = new Student(101, "Haris");
        StudentRepository sr = new StudentRepository();
        sr.save(st1);
        sr.get().display();

        StringRepository str = new StringRepository();
        str.save("Soban");
        System.out.println(str.get());;
    }
}
