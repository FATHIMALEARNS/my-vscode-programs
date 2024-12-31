import java.util.*;
public class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,count=0,i;
        System.out.println("Enter the no");
        num=sc.nextInt();
        for(i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                count=count+1;
            }
        }
        if(count<=0)
        System.out.println("the no is prime");
        else 
        System.out.println("the no is not prime");
    }
}