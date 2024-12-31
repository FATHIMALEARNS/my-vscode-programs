class employee
{
    void display()
    {
        System.out.println("Name of class is employee");
    }
    void calcsalary()
    {
        System.out.println("Salary of employee is 10000");
    }
}

class engineer extends employee
{
    void display()
    {
       super.display();
       System.out.println("Name of class is engineer");
    }
    void calcsalary()
    {
        super.calcsalary();
        System.out.println("Salary of employee is 20000");
    }
}

public class Emp
{
    public static void main(String[] args)
    {
        engineer obj=new engineer();
        obj.display();
        obj.calcsalary();
    }
}