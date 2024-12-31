import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        String r="";
        int p=s.length();
        for(i=p-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println("Reversed string is " + r);
        if(r.equals(s))
        System.out.println("String is palindrome");
        else 
        System.out.println("String is not palindrome");
    }
}