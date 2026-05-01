package FileHandling.Filter;
import java.io.*;
public class OnlyExt implements FilenameFilter{
    String extension;
    OnlyExt(String extension){
        this.extension = extension;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(extension);
    }

}
