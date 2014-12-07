import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

/**
 * Write a description of class Writer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Writer
{
   
   
   public Writer(String filePath) throws IOException {
       textWriter(filePath);
    }
    
   public void textWriter(String filePath) throws IOException {
       
            File file = new File(filePath);
            
            if (!file.exists()) {
                file.createNewFile();
            }
 
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(driveLog());
            bw.close();

    }
    
   public String driveLog(){
       //
       ArrayList<String> log = new ArrayList<String>();
       String returnLog = "";
       //log.add(transmission.getMoveSet() + "-");
       
       
       //test
       log.add("Left");
       log.add("Right");
       log.add("Right");
       log.add("Left");
       log.add("Right");
       log.add("Right");
       log.add("Left");
       log.add("Left");
       log.add("Left");
       log.add("Left");
       
       for(String s : log){
           returnLog = returnLog + s + "-";
        }
        
       return returnLog;
       
    }
}
