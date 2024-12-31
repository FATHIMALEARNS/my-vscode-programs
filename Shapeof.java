//abstraction
abstract class Shape
{
    abstract void noofsides();
}
    class rectangle extends Shape
    {
        void noofsides()
        {
            System.out.println("4 sides");
        }
    }

    class triangle extends Shape
    {
        void noofsides()
        {
            System.out.println("3 sides");
        }
    }

    class hexagon extends Shape
    {
        void noofsides()
        {
            System.out.println("6 sides");
        }
    }

    public class Shapeof
    {
        public static void main(String[] args)
        {
            rectangle r=new rectangle();
            System.out.println("no of sides of rectangle :");
            r.noofsides();

            triangle t=new triangle();
            System.out.println("no of sides of triangle :");
            t.noofsides();

            hexagon h=new hexagon();
            System.out.println("no of sides of hexagon :");
            h.noofsides();
        }
    }