import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class FileOperations
    {
        public static void main(String[] args)throws IOException
        {
            try
            {
                int ch;
                String str="";
                FileReader fr=new FileReader("nice.txt");
                while((ch=fr.read())!=-1)
                {
                    str=str+(char)ch;
                }
                System.out.println(str);
                
                FileWriter fw=new FileWriter("hi.txt");
                fw.write(str);
                fr.close();
                fw.close();
            }
            catch(FileNotFoundException fe)
            {
                System.out.println("file not found"+ fe);
            }
        }
    }