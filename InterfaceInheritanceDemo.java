// Define the base interface
interface Shape {
    void draw();
}

// Define another interface that extends the base interface
interface ColoredShape extends Shape {
    void color();
}

// Class implementing the ColoredShape interface (which indirectly implements Shape)
class Circle implements ColoredShape {
    // Implementing the draw() method from Shape interface
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implementing the color() method from ColoredShape interface
    public void color() {
        System.out.println("Coloring the circle in blue");
    }
}

// Main class to test the implementation
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.color();
    }
}