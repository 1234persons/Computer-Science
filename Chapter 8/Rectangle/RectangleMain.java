package Rectangle;

public class RectangleMain {
    public static void main(String[] args) {

        RectangleMethods rect = new RectangleMethods();
        RectangleMethods rect2 = new RectangleMethods(5, 2);

        if (rect.equals(rect2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }

        System.out.println(rect);
        System.out.println(rect2);

        System.out.println("\nThe area of rectangle one is: " + rect.area());
        System.out.println("The perimeter of rectangle one is: " + rect.perimeter() + "\n");

        System.out.println("The area of rectangle two is: " + rect2.area());
        System.out.println("The perimeter of rectangle two is: " + rect2.perimeter() + "\n");

        RectangleMethods.displayAreaFormula();

    }
}
