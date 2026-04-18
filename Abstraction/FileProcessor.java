package Abstraction;

abstract class FileProcessor {
    void processFile(){
        openFile();
        readFile();
        closeFile();
    }
    void openFile(){
        System.out.println("File is Opening");
    }
    void closeFile(){
        System.out.println("File is Closing");
    }
    abstract void readFile();
}

class TextFileProcessor extends FileProcessor{
    void readFile(){
        System.out.println("TextFileProcessor is read the File");
    }
}
class CSVFileProcessor extends FileProcessor{
    void readFile(){
        System.out.println("CSVFileProcessor is read the File");
    }
}
