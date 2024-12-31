import java.util.*;
public class Frequency
{
    public static void main(String[] args)
    {
        int i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        System.out.println("enter character to search:");
        char x=sc.nextLine().charAt(0);
        for(i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)==x)
                c=c+1;
        }
        if(c==0)
        {
            System.out.println("element is not present");
        }
        else 
        {
            System.out.println("frequency is "+c);
        }

    }
}