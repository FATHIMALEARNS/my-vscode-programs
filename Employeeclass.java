//inheritance

class employee
{
    String name;
    int age;
    String phnNo;
    String address;
    double salary;

    employee(String name,int age,String phnNo,String address,double salary)
    {
        this.name=name;
        this.age=age;
        this.phnNo=phnNo;
        this.address=address;
        this.salary=salary;
    }

    void printSalary()
    {
        System.out.println("Salary:"+salary);
    }

}

class officer extends employee
{
    String specialization;
    officer(String name,int age,String phnNo,String address,double salary,String specialization)
    {
        super(name,age,phnNo,address,salary);
        this.specialization=specialization;
    }
    void printofficerdetails()
    {
        System.out.println("officer details:");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("phn no:"+phnNo);
        System.out.println("address:"+address);
        System.out.println("specialization"+specialization);
        printSalary();
    }
}

class manager extends employee
{
    String department;
    manager(String name,int age,String phnNo,String address,double salary,String department)
    {
        super(name,age,phnNo,address,salary);
        this.department=department;
    }
    void printmanagerdetails()
    {
        System.out.println("manager details:");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("phn no:"+phnNo);
        System.out.println("address:"+address);
        System.out.println("department"+department);
        printSalary();
    }
}

public class Employeeclass
{
    public static void main(String[] ars)
    {
        officer o=new officer("fathima",18,"5355225","abc",40000,"itdept");
        o.printofficerdetails();

        manager m=new manager("rahul",45,"8994985","def",600000,"csdept");
        m.printmanagerdetails();

    }
}