package Interfaces.cpu;

class Main implements Computer, Computer.CPU{
    public void run(){
        System.out.println("Computer is Running");
    }
    public void process(){
        System.out.println("CPU is processing");
    }
    public static void main(String args[]){
        Main m = new Main();
        m.run();
        m.process();
    }
}
