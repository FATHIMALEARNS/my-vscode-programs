class Program extends Exception
{
public Program()
{
System.out.println("User defined exception");
}
}

public class Exc
{
public static void main(String args[])
{
try
{
int a=40/0;
System.out.println(a);
}
catch(Exception e)
{
Program obj=new Program();
System.out.println("ERROR....."+e);
}
}
}