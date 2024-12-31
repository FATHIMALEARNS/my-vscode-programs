import java.util.*;
public class Revstr
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to reverse:");
        String s=sc.nextLine();
        String r="";
        int p=s.length();
        for(i=p-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println("Reversed string is:"+r);
    }
}