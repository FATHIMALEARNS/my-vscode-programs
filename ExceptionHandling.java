public class ExceptionHandling
{
    public static void ErrorMethod()
    {
        int result=5/0;
        System.out.println("result:"+result);
    }
    public static void main(String[] args) throws Exception
    {
        try
        {
            ErrorMethod();
        }
        catch(ArithmeticException e)
        {
            System.out.println("division by 0"+e);
        }
        finally
        {
            System.out.println("error method executed");
        }
    }
}
