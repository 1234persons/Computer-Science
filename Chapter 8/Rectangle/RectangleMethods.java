package Rectangle;

public class Rectangle {
    
    private double width;
    private double length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
    }

    public double area() {
        return(length * width);
    }

    public double perimeter() {
        return(2 * length + 2 * width);
    }

    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a rectangle is Width * Length");
    }

}

