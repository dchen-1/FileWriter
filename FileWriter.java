import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
    public String read(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str = "";
        while(br.ready()){
            str+=br.read();
        }
        br.close();
        return str;
    }

    
    public void write(String fileName, String s) throws IOException{
     PrintWriter pw = new PrintWriter(fileName);
     pw.write(s);
     pw.close();
    }
}
