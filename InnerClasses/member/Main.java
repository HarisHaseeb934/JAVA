package InnerClasses.member;

class Main {
    public static void main(String args[]){
//        University uni = new University();
//        University.Department depart = uni.new Department("Emerson University", "Computing");
//        depart.showDetails();


        Computer pc = new Computer("HP");
        Computer.CPU process = pc.new CPU();
        process.show();
    }
}
