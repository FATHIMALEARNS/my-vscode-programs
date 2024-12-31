import java.util.*;
public class SumOfIntegers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of integers separated by spaces:");

        String input=sc.nextLine();

        StringTokenizer st=new StringTokenizer(input);
        int sum=0;

        System.out.println("the integers are:");
        while(st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            System.out.println(num);
            sum=sum+num;
        }
        System.out.println("sum of integers:"+sum);
    }
}