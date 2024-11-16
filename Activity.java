public class Activity {
    public static void main(String[] args) {
        Shape circle = new Circle(10, "Yellow", true);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("\n");

        Shape rectangle = new Rectangle(15, 20, "Red", false);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("\n");

        Shape square = new Square(18, "Pink", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}