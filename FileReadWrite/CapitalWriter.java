import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import sun.nio.cs.StreamDecoder; // not able to use 

class CapitalWriter extends FileWriter{
    public CapitalWriter(String file) throws IOException {
        super(file);
    }

    // @Override
    // public int read() throws IOException {
    //     return sd.read();
    // }
    
    @Override
    public void write(String str) throws IOException {
        String capitalString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n = (int) c;
            if (97 <= n && n <= 122) {
                n = n - 32;
            }
            capitalString = capitalString + (char) n;
        }
        write(capitalString, 0, str.length());
    }

    public void read() throws IOException {
        final FileReader fr = new FileReader("helo.txt");
          int i;    
          while((i=fr.read())!=-1){  
            if (97<=i && i<=122) System.out.print((char)(i-32));
            else System.out.print((char)i); 
          }   
          fr.close();    
    }

    public static void main(String[] args) {
        try {
            CapitalWriter fileWriter = new CapitalWriter("helo.txt");
            fileWriter.write("hekki");
            fileWriter.close();
            fileWriter.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}