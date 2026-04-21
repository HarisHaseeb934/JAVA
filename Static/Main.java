package Static;

class Main {
    public static void main(String args[]){
//        Student s1 = new Student("Haris", 9);
//        Student s2 = new Student("Soban", 23);
//        Student s3 = new Student("Mute", 2);
//        Student s4 = new Student("Usama", 12);
//        Student s5 = new Student("Abdul-Wasay", 27);
//        s5.show();

//        MathUtil.square(12);

//        Loaded l = new Loaded();

//        College s1 = new College("Haris");
//        College s2 = new College("Soban");
//        College s3 = new College("Mute");
//        System.out.println(College.collegeName);

        FinalObject a = FinalObject.getinstance();
        a.name = "HAris";
        FinalObject b = FinalObject.getinstance();
        System.out.println(b.name);
    }
}
