import java.text.NumberFormat;

public class Circle {
    private static NumberFormat number = NumberFormat.getNumberInstance();
    private static final double PI = 3.14;
    private double radius;
    
    public Circle() { // Constructor
        radius = 1;
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
}

