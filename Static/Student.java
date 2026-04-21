package Static;

class Student {
    static int count = 0;
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
        count++;
    }
    void show(){
        System.out.println("Total Students in your class = " + count);
    }
}
