import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
    public static String read(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        StringBuilder str = new StringBuilder (""); //sophia changed this from a string to a stringBuilder
        while(br.ready()){
            str.append ((char)(br.read())); //hey og person, sophia also typecasted this into char for you
        }
        br.close();
        return str.toString();
    }

    
    public void write(String fileName, String s) throws IOException{
     PrintWriter pw = new PrintWriter(fileName);
     pw.write(s);
     pw.close();
    }

    //Sophia's nice edits
    public static int countCharacters (String fileName) throws IOException
    {
        BufferedReader br = new BufferedReader (new FileReader (fileName));
        int characterCount = 0;
        while (br.ready())
        {
            characterCount ++;
            br.read();
        }
        br.close();
        return characterCount;
    }

    public static void main (String [] args) throws IOException
    {
        System.out.println (read ("FileWriterTester.txt")); //works
        System.out.println (countCharacters ("FileWriterTester.txt")); //works
    }
}
