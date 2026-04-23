package InnerClasses.member;

class Computer {
    private String brand;
    Computer(String brand){
        this.brand = brand;
    }
    class CPU{
        void show(){
            System.out.println("Brand : " + brand);
        }
    }
}
