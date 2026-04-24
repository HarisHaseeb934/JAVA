package Interfaces.prinscan;

class Printer implements Printable , Scannable{
    String name;
    String company;
    Printer(String name, String company){
        this.name = name;
        this.company = company;
    }
    void showDetails(){
        System.out.println("Printer Name is " + name);
        System.out.println("Printer Company is " + company);
    }
    public void printing(){
        System.out.println("Printing is Start");
    }
    public void scanning(){
        System.out.println("Scanning is Start");
    }
}
