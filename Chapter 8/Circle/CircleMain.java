package Circle;

import java.text.NumberFormat;


public class CircleMain {
    public static void main(String[] args) {
        
        Circle spot = new Circle();
        Circle spotP2 = new Circle(5, "Red");

        NumberFormat number = NumberFormat.getNumberInstance();

        if (spot.equals(spotP2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }

        System.out.println(spot);
        System.out.println(spotP2);
  
        spot.setRadius(10);

        System.out.println("The radius is " + spot.getRadius());
        System.out.println("The area is " + spot.area());
        System.out.println("The circumference is " + number.format(spot.circumference()));
        System.out.println("The color of the first circle is: " + spot.getColor() + "\n");

        System.out.println("The radius of the second circle is: " + spotP2.getRadius());
        System.out.println("The area is: " + spotP2.area());
        System.out.println("The circumference is: " + number.format(spotP2.circumference()));
        System.out.println("The color of the first circle is: " + spotP2.getColor() + "\n");

        Circle.displayAreaFormula();
    }
}
