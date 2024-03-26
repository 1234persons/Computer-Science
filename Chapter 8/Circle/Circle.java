package Circle;

public class Circle {
    private static final double PI = 3.14;
    private String color;
    private double radius;

    public Circle() { // Constructor
        radius = 1;
        color = "Black";
    }

    public Circle(double newRad, String newColor) { // Overloaded Constructor, Now accepts radius, Circle P2
        radius = newRad;
        color = newColor;
    }

    public void setRadius(double newRadius) { // Accessor Method
        radius = newRadius;
    }

    public double getRadius() {
        return (radius);
    }

    public double area() {
        double circleArea = PI * radius * radius;

        return (circleArea);
    }

    public double circumference() { // Mutator
        double circumference = 2 * PI * radius;

        return (circumference);
    }

    public String getColor() {
        return(color);
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String toString() {
        String circleString;

        circleString = "Circle has radius " + radius;

        return (circleString);
    }

    public boolean equals(Object C) {

        Circle testObj = (Circle) C;

        if (testObj.getRadius() == radius) {
            return (true);
        } else {
            return (false);
        }

    }

    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a circle is a=Pi*r*r");
    }
}
