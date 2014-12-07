import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.util.*;
import java.io.IOException;

/**
 * Write a description of class Reader here.
 * 
 * @author Tim Schijvenaars 
 * @version 1.0
 */
public class Reader
{
    List<String> strings = new ArrayList<>();
    
    public Reader(String filePath) throws IOException{
        readFile(filePath);
    }
    
    public void readFile(String filePath) throws IOException{
       
        for (String line : Files.readAllLines(Paths.get(filePath),Charset.forName("UTF-8"))) {
            for (String part : line.split("-")) {
                String i = String.valueOf(part);
                strings.add(i);
            }
        }
    }
    
    public String getString(int i){
        return strings.get(i); 
    }
    
}
