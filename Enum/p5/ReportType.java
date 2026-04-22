package Enum.p5;

public enum ReportType implements Printable{
    PDF{
        public void print(){
            System.out.println("PDF is Ready");
        }
    },
    WORD{
        public void print(){
            System.out.println("WORD is Ready");
        }
    },
    EXCEL{
        public void print(){
            System.out.println("EXCEL is Ready");
        }
    }
}
