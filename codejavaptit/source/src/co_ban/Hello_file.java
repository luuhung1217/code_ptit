import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Hello_file {
    
    public static void main(String[] args) {
        String filename="Hello.txt"; 
        FileReader r;
        try{
            r=new FileReader(filename);
            int k;
            while(true){
                k=r.read();
                if(k==-1) 
                    break;
                char c=(char) k;
                System.out.print(c);
            }
            r.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
