//method overloading
import java.util.*;
class method
{
    void area(double r)
    {
        double a=3.14*r*r;
        System.out.println("Area of circle is:"+a);
    }

    void area(double b,double h)
    {
        double a=.5*b*h;
        System.out.println("Area of triangle is:"+a);
    }

    void area(int l,int e)
    {
        int a=l*e;
        System.out.println("Area of rectangle is:"+a);
    }
}

public class Area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        method obj=new method();
        System.out.println("enter radius");
        double r=sc.nextDouble();

        System.out.println("enter base and height");
        double b=sc.nextDouble();
        double h=sc.nextDouble();

        System.out.println("enter length and breadth");
        int l=sc.nextInt();
        int e=sc.nextInt();

        obj.area(r);
        obj.area(b,h);
        obj.area(l,e);
    }
}