
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ModeleLectureFichier {

public String[][] ModeleLectureFichier() throws IOException {
    	
    	
    File file = new File("airports.dat");
    
    FileReader reader = new FileReader(file);
    
    BufferedReader buffReader = new BufferedReader(reader);
   
    String s = null;

        ArrayList<String[]> lst = new ArrayList<String[]>();
        
        String[][] res = null;

        while((s = buffReader.readLine()) != null){
        	
            String[] arr = s.replaceAll("\"","" ).split(",");
            
            lst.add(arr);
        }

        buffReader.close();

        res = new String[lst.size()][lst.get(0).length];
       
        return res = lst.toArray(res);
      
    }


}
