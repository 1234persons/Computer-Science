import java.text.NumberFormat;

public class Circle {
    private static NumberFormat number = NumberFormat.getNumberInstance();
    private static final double PI = 3.14;
    private double radius;

    public static void main(String[] args) {
        Circle spot = new Circle();

        spot.setRadius(5);

        System.out.println("The radius is " + spot.getRadius());
        System.out.println("The area is " + spot.area());
        System.out.println("The circumference is " + number.format(spot.circumference()));
    }
    
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

