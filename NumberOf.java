//prgm to display nof characters,lines and words in a text file 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NumberOf
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            int ch,countcha=0,countline=0,countword=0;
            String str=" ";
            FileInputStream fs=new FileInputStream("nice.txt");
            while(fs.available()!=0)
            {
                ch=fs.read();
                if(ch>=65&&ch<=90||ch>=97&&ch<=122)
                {
                    countcha=countcha+1;
                }
                if(ch==32)
                {
                    countword=countword+1;
                }
                if(ch==10)
                {
                    countline=countline+1;
                    countword=countword+1;
                    
                   }
                
                
            }
            System.out.println("no of characters:"+countcha);
            System.out.println("no of words:"+countword);
            System.out.println("no of lines:"+countline);
            fs.close();
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("filenotfound"+fe);
        }
    }
}