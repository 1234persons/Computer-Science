package Rectangle;

public class RectangleMethods {

    private double width;
    private double length;

    public RectangleMethods() {
        width = 1;
        length = 1;
    }

    public RectangleMethods(double newWidth, double newLength) {
        width = newWidth;
        length = newLength;
    }

    public double getLength() {
        return(length);
    }

    public double getWidth() {
        return(width);
    }

    public double area() {
        return (length * width);
    }

    public double perimeter() {
        return (2 * length + 2 * width);
    }

    public static void displayAreaFormula() {
        System.out.println("The formula for the area of a rectangle is Width * Length");
    }

    public String toString() {
        String rectangleString;

        rectangleString = "This rectangle has a length of " + length + " and a width of " + width;

        return (rectangleString);
    }

    public boolean equals(Object R) {

        RectangleMethods testObj = (RectangleMethods)R;

        if (testObj.getLength() == length && testObj.getWidth() == width) {
            return(true);
        } else {
            return(false);
        }



    }

}
