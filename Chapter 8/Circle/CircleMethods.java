package Circle;
public class Circle {
    private static final double PI = 3.14;
    private double radius;
    
    public Circle() { // Constructor
        radius = 1;
    }

    public Circle(double newRad) { // Overloaded Constructor, Now accepts radius, Circle P2
        radius = newRad;
    }

    public void setRadius(double newRadius) { // Accessor Method
        radius = newRadius;
    }

    public double circumference() { // Mutator
        double circumference = 2 * PI * radius;

        return(circumference);
    }

    public double area() {
        double circleArea = PI * radius * radius;

        return(circleArea);
    }

    public double getRadius() {
        return(radius);
    }

    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is a=Pi*r*r");
    }
}
