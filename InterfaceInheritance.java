//interface inheritance
interface printable
{
    void print();
}
interface showable extends printable
{
    void show();
}
class test implements showable
{
    public void print()
    {
        System.out.println("print method");
    }
    public void show()
    {
        System.out.println("show method");
    }
}

class InterfaceInheritance
{
    public static void main(String[] args)
    {
        test t=new test();
        t.print();
        t.show();
    }
}
