package Interfaces.prinscan;

class Main {
    public static void main(String args[]){
        Printer prnt = new Printer("M404dn", "HP");
        prnt.showDetails();
        prnt.printing();
        prnt.scanning();
    }
}
